package com.BMT_Shop.mapper.address;

import com.BMT_Shop.dto.address.AddressRequest;
import com.BMT_Shop.dto.address.AddressResponse;
import com.BMT_Shop.entity.address.Address;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface AddressMapper extends GenericMapper<Address, AddressRequest, AddressResponse> {

    @Override
    @Mapping(source = "provinceId", target = "province")
    @Mapping(source = "districtId", target = "district")
    @Mapping(source = "wardId", target = "ward")
    Address requestToEntity(AddressRequest request);

    @Override
    @Mapping(source = "provinceId", target = "province")
    @Mapping(source = "districtId", target = "district")
    @Mapping(source = "wardId", target = "ward")
    Address partialUpdate(@MappingTarget Address entity, AddressRequest request);

}
