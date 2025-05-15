package com.BMT_Shop.dto.cashbook;

import com.BMT_Shop.entity.cashbook.PaymentMethodType;
import lombok.Data;

import java.time.Instant;

@Data
public class PaymentMethodResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private PaymentMethodType code;
    private Integer status;
}
