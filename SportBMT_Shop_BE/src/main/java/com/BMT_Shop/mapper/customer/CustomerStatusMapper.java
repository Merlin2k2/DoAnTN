package com.BMT_Shop.mapper.customer;

import com.BMT_Shop.dto.customer.CustomerStatusRequest;
import com.BMT_Shop.dto.customer.CustomerStatusResponse;
import com.BMT_Shop.entity.customer.CustomerStatus;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerStatusMapper extends GenericMapper<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> {
}
