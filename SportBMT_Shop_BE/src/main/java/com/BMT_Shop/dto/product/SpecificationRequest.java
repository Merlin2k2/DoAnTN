package com.BMT_Shop.dto.product;

import lombok.Data;

@Data
public class SpecificationRequest {
    private String name;
    private String code;
    private String description;
    private Integer status;
}
