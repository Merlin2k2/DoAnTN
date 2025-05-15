package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.GuaranteeRequest;
import com.BMT_Shop.dto.product.GuaranteeResponse;
import com.BMT_Shop.entity.product.Guarantee;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuaranteeMapper extends GenericMapper<Guarantee, GuaranteeRequest, GuaranteeResponse> {
}
