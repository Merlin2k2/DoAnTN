package com.BMT_Shop.mapper.order;

import com.BMT_Shop.dto.order.OrderCancellationReasonRequest;
import com.BMT_Shop.dto.order.OrderCancellationReasonResponse;
import com.BMT_Shop.entity.order.OrderCancellationReason;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderCancellationReasonMapper extends GenericMapper<OrderCancellationReason, OrderCancellationReasonRequest,
        OrderCancellationReasonResponse> {}
