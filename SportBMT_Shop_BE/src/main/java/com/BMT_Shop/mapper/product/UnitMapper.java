package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.UnitRequest;
import com.BMT_Shop.dto.product.UnitResponse;
import com.BMT_Shop.entity.product.Unit;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitMapper extends GenericMapper<Unit, UnitRequest, UnitResponse> {
}
