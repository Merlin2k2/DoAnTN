package com.BMT_Shop.service.general;

import com.BMT_Shop.dto.general.NotificationResponse;

public interface NotificationService {

    void pushNotification(String uniqueKey, NotificationResponse notification);

}
