package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.BrandRequest;
import com.BMT_Shop.dto.product.BrandResponse;
import com.BMT_Shop.entity.product.Brand;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper extends GenericMapper<Brand, BrandRequest, BrandResponse> {}
