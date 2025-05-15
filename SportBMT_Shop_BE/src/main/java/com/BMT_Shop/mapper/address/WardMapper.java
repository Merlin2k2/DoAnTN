package com.BMT_Shop.mapper.address;

import com.BMT_Shop.dto.address.WardRequest;
import com.BMT_Shop.dto.address.WardResponse;
import com.BMT_Shop.entity.address.Ward;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface WardMapper extends GenericMapper<Ward, WardRequest, WardResponse> {

    @Override
    @Mapping(source = "districtId", target = "district")
    Ward requestToEntity(WardRequest request);

    @Override
    @Mapping(source = "districtId", target = "district")
    Ward partialUpdate(@MappingTarget Ward entity, WardRequest request);

}
