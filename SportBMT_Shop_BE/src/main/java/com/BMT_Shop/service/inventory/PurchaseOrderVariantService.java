package com.BMT_Shop.service.inventory;

import com.BMT_Shop.dto.inventory.PurchaseOrderVariantRequest;
import com.BMT_Shop.dto.inventory.PurchaseOrderVariantResponse;
import com.BMT_Shop.entity.inventory.PurchaseOrderVariantKey;
import com.BMT_Shop.service.CrudService;

public interface PurchaseOrderVariantService extends CrudService<PurchaseOrderVariantKey, PurchaseOrderVariantRequest,
        PurchaseOrderVariantResponse> {}
