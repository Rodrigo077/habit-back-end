package com.habit.payment.entity;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "dataPagamento")
    private OffsetDateTime dataPagamento;

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
}