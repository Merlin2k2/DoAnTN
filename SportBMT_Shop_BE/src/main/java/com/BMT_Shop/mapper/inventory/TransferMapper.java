package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.TransferRequest;
import com.BMT_Shop.dto.inventory.TransferResponse;
import com.BMT_Shop.entity.inventory.Transfer;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DocketMapper.class)
public interface TransferMapper extends GenericMapper<Transfer, TransferRequest, TransferResponse> {}
