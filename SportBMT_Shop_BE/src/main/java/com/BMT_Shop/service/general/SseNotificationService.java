package com.BMT_Shop.service.general;

import com.BMT_Shop.dto.general.NotificationResponse;
import com.BMT_Shop.mapper.general.EventMapper;
import com.BMT_Shop.repository.general.EmitterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Primary
@AllArgsConstructor
@Slf4j
public class SseNotificationService implements NotificationService {

    private final EmitterRepository emitterRepository;
    private final EventMapper eventMapper;

    // uniqueKey thường là username
    @Override
    public void pushNotification(String uniqueKey, NotificationResponse notification) {
        emitterRepository
                .getByUniqueKey(uniqueKey)
                .ifPresentOrElse(emitter -> {
                    try {
                        log.debug("Sending event: {} for key: {}", notification, uniqueKey);
                        emitter.send(eventMapper.toSseEventBuilder("message", notification));
                    } catch (IOException | IllegalStateException e) {
                        log.debug("Error while sending event: {} for key: {} - exception: {}", notification, uniqueKey, e);
                        emitterRepository.remove(uniqueKey);
                    }
                }, () -> log.debug("No emitter for key: {}", uniqueKey));
    }

}
