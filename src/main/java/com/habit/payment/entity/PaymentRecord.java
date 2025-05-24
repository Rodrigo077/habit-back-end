package com.habit.payment.entity;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record PaymentRecord(
        @NotNull Integer userId) {
}
