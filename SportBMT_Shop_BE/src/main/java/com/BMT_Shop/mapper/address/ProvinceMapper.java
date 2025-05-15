package com.BMT_Shop.mapper.address;

import com.BMT_Shop.dto.address.ProvinceRequest;
import com.BMT_Shop.dto.address.ProvinceResponse;
import com.BMT_Shop.entity.address.Province;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProvinceMapper extends GenericMapper<Province, ProvinceRequest, ProvinceResponse> {
}
