package com.BMT_Shop.service.inventory;

import com.BMT_Shop.dto.order.OrderVariantRequest;
import com.BMT_Shop.dto.order.OrderVariantResponse;
import com.BMT_Shop.entity.order.OrderVariantKey;
import com.BMT_Shop.service.CrudService;

public interface OrderVariantService extends CrudService<OrderVariantKey, OrderVariantRequest, OrderVariantResponse> {}
