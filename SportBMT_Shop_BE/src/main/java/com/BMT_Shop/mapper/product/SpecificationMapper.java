package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.SpecificationRequest;
import com.BMT_Shop.dto.product.SpecificationResponse;
import com.BMT_Shop.entity.product.Specification;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SpecificationMapper extends GenericMapper<Specification, SpecificationRequest, SpecificationResponse> {
}
