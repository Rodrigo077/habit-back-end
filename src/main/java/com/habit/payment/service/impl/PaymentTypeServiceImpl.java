package com.habit.payment.service.impl;

import com.habit.payment.entity.PaymentTypeEntity;
import com.habit.payment.repository.PaymentTypeRepository;
import com.habit.payment.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {

    @Autowired
    private PaymentTypeRepository paymentTypeRepository;

    @Override
    public PaymentTypeEntity getById(Long id) {
        return paymentTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PaymentType not found with id " + id));
    }
}
