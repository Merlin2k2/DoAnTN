package com.BMT_Shop.service.inventory;

import com.BMT_Shop.dto.inventory.CountVariantRequest;
import com.BMT_Shop.dto.inventory.CountVariantResponse;
import com.BMT_Shop.entity.inventory.CountVariantKey;
import com.BMT_Shop.service.CrudService;

public interface CountVariantService extends CrudService<CountVariantKey, CountVariantRequest, CountVariantResponse> {}
