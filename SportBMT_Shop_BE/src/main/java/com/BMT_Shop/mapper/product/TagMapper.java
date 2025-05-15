package com.BMT_Shop.mapper.product;

import com.BMT_Shop.dto.product.TagRequest;
import com.BMT_Shop.dto.product.TagResponse;
import com.BMT_Shop.entity.product.Tag;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper extends GenericMapper<Tag, TagRequest, TagResponse> {
}
