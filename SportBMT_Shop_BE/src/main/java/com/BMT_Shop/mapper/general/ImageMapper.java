package com.BMT_Shop.mapper.general;

import com.BMT_Shop.dto.general.ImageRequest;
import com.BMT_Shop.dto.general.ImageResponse;
import com.BMT_Shop.entity.general.Image;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper extends GenericMapper<Image, ImageRequest, ImageResponse> {}
