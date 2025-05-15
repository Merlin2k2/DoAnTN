package com.BMT_Shop.service.inventory;

import com.BMT_Shop.dto.inventory.DocketVariantRequest;
import com.BMT_Shop.dto.inventory.DocketVariantResponse;
import com.BMT_Shop.entity.inventory.DocketVariantKey;
import com.BMT_Shop.service.CrudService;

public interface DocketVariantService extends CrudService<DocketVariantKey, DocketVariantRequest, DocketVariantResponse> {}
