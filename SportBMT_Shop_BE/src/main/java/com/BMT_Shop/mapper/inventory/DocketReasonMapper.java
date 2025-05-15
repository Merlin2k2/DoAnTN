package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.DocketReasonRequest;
import com.BMT_Shop.dto.inventory.DocketReasonResponse;
import com.BMT_Shop.entity.inventory.DocketReason;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocketReasonMapper extends GenericMapper<DocketReason, DocketReasonRequest, DocketReasonResponse> {}
