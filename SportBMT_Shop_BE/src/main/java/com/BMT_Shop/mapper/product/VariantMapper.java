package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.VariantRequest;
import com.BMT_Shop.dto.product.VariantResponse;
import com.BMT_Shop.entity.product.Variant;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VariantMapper extends GenericMapper<Variant, VariantRequest, VariantResponse> {
}
