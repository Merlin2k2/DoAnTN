package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.PropertyRequest;
import com.BMT_Shop.dto.product.PropertyResponse;
import com.BMT_Shop.entity.product.Property;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyMapper extends GenericMapper<Property, PropertyRequest, PropertyResponse> {
}
