package com.habit.payment.service.impl;

import com.habit.payment.entity.PaymentEntity;
import com.habit.payment.repository.PaymentRepository;
import com.habit.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.OffsetDateTime;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentEntity create(PaymentEntity paymentEntity) {
        paymentEntity.setDataPagamento(OffsetDateTime.now());
        return paymentRepository.save(paymentEntity);
    }
}
