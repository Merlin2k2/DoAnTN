package com.BMT_Shop.mapper.inventory;

import com.BMT_Shop.dto.inventory.DestinationRequest;
import com.BMT_Shop.dto.inventory.DestinationResponse;
import com.BMT_Shop.entity.inventory.Destination;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface DestinationMapper extends GenericMapper<Destination, DestinationRequest, DestinationResponse> {}
