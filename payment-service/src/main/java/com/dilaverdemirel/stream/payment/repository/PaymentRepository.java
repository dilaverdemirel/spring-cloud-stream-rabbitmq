package com.dilaverdemirel.stream.payment.repository;

import com.dilaverdemirel.stream.payment.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Repository
public interface PaymentRepository extends CrudRepository<Payment, String> {
}
