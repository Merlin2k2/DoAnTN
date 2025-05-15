package com.BMT_Shop.mapper.customer;

import com.BMT_Shop.dto.customer.CustomerGroupRequest;
import com.BMT_Shop.dto.customer.CustomerGroupResponse;
import com.BMT_Shop.entity.customer.CustomerGroup;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerGroupMapper extends GenericMapper<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> {
}
