package com.BMT_Shop.exception;

import lombok.Value;

import java.time.Instant;

@Value
public class ErrorMessage {
    int statusCode;
    Instant timestamp;
    String message;
    String description;
}
