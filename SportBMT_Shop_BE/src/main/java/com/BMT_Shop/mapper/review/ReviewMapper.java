package com.BMT_Shop.mapper.review;

import com.BMT_Shop.dto.review.ReviewRequest;
import com.BMT_Shop.dto.review.ReviewResponse;
import com.BMT_Shop.entity.review.Review;
import com.BMT_Shop.mapper.GenericMapper;
import com.BMT_Shop.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface ReviewMapper extends GenericMapper<Review, ReviewRequest, ReviewResponse> {

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "productId", target = "product")
    Review requestToEntity(ReviewRequest request);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "productId", target = "product")
    Review partialUpdate(@MappingTarget Review entity, ReviewRequest request);

}
