package com.BMT_Shop.mapper.customer;

import com.BMT_Shop.dto.customer.CustomerRequest;
import com.BMT_Shop.dto.customer.CustomerResponse;
import com.BMT_Shop.entity.customer.Customer;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.authentication.UserMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, UserMapper.class})
public interface CustomerMapper extends GenericMapper<Customer, CustomerRequest, CustomerResponse> {

    @Override
    @Mapping(source = "customerGroupId", target = "customerGroup")
    @Mapping(source = "customerResourceId", target = "customerResource")
    @Mapping(source = "customerStatusId", target = "customerStatus")
    Customer requestToEntity(CustomerRequest request);

    @Override
    @Mapping(source = "customerGroupId", target = "customerGroup")
    @Mapping(source = "customerResourceId", target = "customerResource")
    @Mapping(source = "customerStatusId", target = "customerStatus")
    Customer partialUpdate(@MappingTarget Customer entity, CustomerRequest request);

}
