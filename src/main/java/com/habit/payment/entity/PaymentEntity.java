package com.habit.payment.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.Optional;

@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "dataPagamento")
    private OffsetDateTime dataPagamento;
    @ManyToOne
    @JsonBackReference
    private PaymentTypeEntity paymentType;

    public Long getId() {
        return id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public OffsetDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(OffsetDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public PaymentTypeEntity getPaymentTypeEntity() {
        return paymentType;
    }

    public void setPaymentTypeEntity(PaymentTypeEntity paymentTypeEntity) {
        this.paymentType = paymentTypeEntity;
    }
}