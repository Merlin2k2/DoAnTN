package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.SupplierRequest;
import com.BMT_Shop.dto.product.SupplierResponse;
import com.BMT_Shop.entity.product.Supplier;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface SupplierMapper extends GenericMapper<Supplier, SupplierRequest, SupplierResponse> {
}
