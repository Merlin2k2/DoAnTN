package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.CountRequest;
import com.BMT_Shop.dto.inventory.CountResponse;
import com.BMT_Shop.entity.inventory.Count;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, WarehouseMapper.class, CountVariantMapper.class})
public interface CountMapper extends GenericMapper<Count, CountRequest, CountResponse> {

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count requestToEntity(CountRequest request);

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count partialUpdate(@MappingTarget Count entity, CountRequest request);

}
