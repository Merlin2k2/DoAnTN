package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.StorageLocationRequest;
import com.BMT_Shop.dto.inventory.StorageLocationResponse;
import com.BMT_Shop.entity.inventory.StorageLocation;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.product.VariantMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, WarehouseMapper.class, VariantMapper.class})
public interface StorageLocationMapper extends GenericMapper<StorageLocation, StorageLocationRequest, StorageLocationResponse> {

    @Override
    @Mapping(source = "warehouseId", target = "warehouse")
    @Mapping(source = "variantId", target = "variant")
    StorageLocation requestToEntity(StorageLocationRequest request);

    @Override
    @Mapping(source = "warehouseId", target = "warehouse")
    @Mapping(source = "variantId", target = "variant")
    StorageLocation partialUpdate(@MappingTarget StorageLocation entity, StorageLocationRequest request);

}
