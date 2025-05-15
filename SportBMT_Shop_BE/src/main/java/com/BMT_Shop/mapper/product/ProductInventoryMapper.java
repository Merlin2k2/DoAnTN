package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.inventory.ProductInventoryResponse;
import com.BMT_Shop.projection.inventory.ProductInventory;
import com.BMT_Shop.mapper.inventory.DocketVariantMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {DocketVariantMapper.class, BrandMapper.class, SupplierMapper.class})
public interface ProductInventoryMapper {

    ProductInventoryResponse toResponse(ProductInventory productInventory);

    List<ProductInventoryResponse> toResponse(List<ProductInventory> productInventory);

}
