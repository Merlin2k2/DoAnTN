package com.BMT_Shop.service.inventory;

import com.BMT_Shop.constant.ResourceName;
import com.BMT_Shop.constant.SearchFields;
import com.BMT_Shop.dto.ListResponse;
import com.BMT_Shop.dto.inventory.PurchaseOrderVariantRequest;
import com.BMT_Shop.dto.inventory.PurchaseOrderVariantResponse;
import com.BMT_Shop.entity.inventory.PurchaseOrderVariantKey;
import com.BMT_Shop.mapper.inventory.PurchaseOrderVariantMapper;
import com.BMT_Shop.repository.inventory.PurchaseOrderVariantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PurchaseOrderVariantServiceImpl implements PurchaseOrderVariantService {

    private PurchaseOrderVariantRepository purchaseOrderVariantRepository;

    private PurchaseOrderVariantMapper purchaseOrderVariantMapper;

    @Override
    public ListResponse<PurchaseOrderVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.PURCHASE_ORDER_VARIANT, purchaseOrderVariantRepository, purchaseOrderVariantMapper);
    }

    @Override
    public PurchaseOrderVariantResponse findById(PurchaseOrderVariantKey id) {
        return defaultFindById(id, purchaseOrderVariantRepository, purchaseOrderVariantMapper, ResourceName.PURCHASE_ORDER_VARIANT);
    }

    @Override
    public PurchaseOrderVariantResponse save(PurchaseOrderVariantRequest request) {
        return defaultSave(request, purchaseOrderVariantRepository, purchaseOrderVariantMapper);
    }

    @Override
    public PurchaseOrderVariantResponse save(PurchaseOrderVariantKey id, PurchaseOrderVariantRequest request) {
        return defaultSave(id, request, purchaseOrderVariantRepository, purchaseOrderVariantMapper, ResourceName.PURCHASE_ORDER_VARIANT);
    }

    @Override
    public void delete(PurchaseOrderVariantKey id) {
        purchaseOrderVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<PurchaseOrderVariantKey> ids) {
        purchaseOrderVariantRepository.deleteAllById(ids);
    }

}
