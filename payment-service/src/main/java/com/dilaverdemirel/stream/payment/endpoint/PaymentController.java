package com.dilaverdemirel.stream.payment.endpoint;

import com.dilaverdemirel.stream.payment.domain.Payment;
import com.dilaverdemirel.stream.payment.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@RestController
@RequestMapping(path = "/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Void> doPayment(@RequestBody Payment payment) {
        paymentService.doPayment(payment);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
