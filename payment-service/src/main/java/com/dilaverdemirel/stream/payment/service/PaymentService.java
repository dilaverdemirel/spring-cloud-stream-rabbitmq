package com.dilaverdemirel.stream.payment.service;

import com.dilaverdemirel.stream.payment.domain.Payment;
import com.dilaverdemirel.stream.payment.repository.PaymentRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public PaymentService(PaymentRepository paymentRepository,
                          ApplicationEventPublisher applicationEventPublisher) {
        this.paymentRepository = paymentRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public void doPayment(Payment payment) {
        paymentRepository.save(payment);
        applicationEventPublisher.publishEvent(payment);
    }
}
