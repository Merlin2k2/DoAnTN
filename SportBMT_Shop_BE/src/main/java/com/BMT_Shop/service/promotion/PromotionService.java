package com.BMT_Shop.service.promotion;

import com.BMT_Shop.dto.promotion.PromotionRequest;
import com.BMT_Shop.dto.promotion.PromotionResponse;
import com.BMT_Shop.service.CrudService;

import java.time.Instant;

public interface PromotionService extends CrudService<Long, PromotionRequest, PromotionResponse> {

    boolean checkCanCreatePromotionForProduct(Long productId, Instant startDate, Instant endDate);

}
