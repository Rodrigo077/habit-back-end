package com.habit.payment.service;

import com.habit.payment.entity.PaymentTypeEntity;

import java.util.Optional;

public interface PaymentTypeService {

    public PaymentTypeEntity getById(Long id);
}
