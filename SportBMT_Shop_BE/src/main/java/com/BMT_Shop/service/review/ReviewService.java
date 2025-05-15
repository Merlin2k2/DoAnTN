package com.BMT_Shop.service.review;

import com.BMT_Shop.dto.review.ReviewRequest;
import com.BMT_Shop.dto.review.ReviewResponse;
import com.BMT_Shop.service.CrudService;

public interface ReviewService extends CrudService<Long, ReviewRequest, ReviewResponse> {}
