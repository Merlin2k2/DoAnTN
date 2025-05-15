package com.BMT_Shop.mapper.customer;

import com.BMT_Shop.dto.customer.CustomerResourceRequest;
import com.BMT_Shop.dto.customer.CustomerResourceResponse;
import com.BMT_Shop.entity.customer.CustomerResource;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerResourceMapper extends GenericMapper<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> {
}
