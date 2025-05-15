package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.WarehouseRequest;
import com.BMT_Shop.dto.inventory.WarehouseResponse;
import com.BMT_Shop.entity.inventory.Warehouse;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface WarehouseMapper extends GenericMapper<Warehouse, WarehouseRequest, WarehouseResponse> {}
