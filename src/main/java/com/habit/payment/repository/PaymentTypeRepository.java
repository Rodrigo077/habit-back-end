package com.habit.payment.repository;

import com.habit.payment.entity.PaymentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentTypeEntity, Long> {
}
