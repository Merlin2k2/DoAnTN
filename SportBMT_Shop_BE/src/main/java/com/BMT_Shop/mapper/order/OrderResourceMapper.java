package com.BMT_Shop.mapper.order;


import com.BMT_Shop.dto.order.OrderResourceRequest;
import com.BMT_Shop.dto.order.OrderResourceResponse;
import com.BMT_Shop.entity.order.OrderResource;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.customer.CustomerResourceMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, CustomerResourceMapper.class})
public interface OrderResourceMapper extends GenericMapper<OrderResource, OrderResourceRequest, OrderResourceResponse> {

    @Override
    @Mapping(source = "customerResourceId", target = "customerResource")
    OrderResource requestToEntity(OrderResourceRequest request);

    @Override
    @Mapping(source = "customerResourceId", target = "customerResource")
    OrderResource partialUpdate(@MappingTarget OrderResource entity, OrderResourceRequest request);

}
