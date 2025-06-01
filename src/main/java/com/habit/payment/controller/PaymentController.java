package com.habit.payment.controller;

import com.habit.payment.entity.PaymentEntity;
import com.habit.payment.entity.PaymentRecord;
import com.habit.payment.entity.PaymentTypeEntity;
import com.habit.payment.service.PaymentService;
import com.habit.payment.service.PaymentTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentTypeService paymentTypeService;

    @PostMapping
    public ResponseEntity<PaymentEntity> create(@RequestBody @Valid PaymentRecord paymentRecord){

        try{
            PaymentTypeEntity paymentTypeEntity = paymentTypeService.getById(paymentRecord.paymentType());

            PaymentEntity paymentEntity = new PaymentEntity();
            paymentEntity.setUserId(paymentRecord.userId());
            paymentEntity.setPaymentTypeEntity(paymentTypeEntity);
            paymentEntity = paymentService.registrarPagamento(paymentEntity);
            return new ResponseEntity<>(paymentEntity, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
