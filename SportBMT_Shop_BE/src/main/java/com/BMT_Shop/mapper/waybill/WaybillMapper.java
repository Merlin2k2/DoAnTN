package com.BMT_Shop.mapper.waybill;

import com.BMT_Shop.dto.waybill.WaybillRequest;
import com.BMT_Shop.dto.waybill.WaybillResponse;
import com.BMT_Shop.entity.waybill.Waybill;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.order.OrderMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, OrderMapper.class})
public interface WaybillMapper extends GenericMapper<Waybill, WaybillRequest, WaybillResponse> {

    @Override
    @Mapping(source = "orderId", target = "order")
    Waybill requestToEntity(WaybillRequest request);

    @Override
    @Mapping(source = "orderId", target = "order")
    Waybill partialUpdate(@MappingTarget Waybill entity, WaybillRequest request);

}
