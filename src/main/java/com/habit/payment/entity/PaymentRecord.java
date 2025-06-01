package com.habit.payment.entity;

import jakarta.validation.constraints.NotNull;

public record PaymentRecord(
        @NotNull Integer userId,
        @NotNull Long paymentType) {
}

