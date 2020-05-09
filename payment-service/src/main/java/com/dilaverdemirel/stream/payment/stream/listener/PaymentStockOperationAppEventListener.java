package com.dilaverdemirel.stream.payment.stream.listener;

import com.dilaverdemirel.stream.payment.domain.Payment;
import com.dilaverdemirel.stream.payment.stream.channel.PaymentServiceStockOperationPublishChannel;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Service
public class PaymentStockOperationAppEventListener {

    private final PaymentServiceStockOperationPublishChannel stockOperationPublishChannel;

    public PaymentStockOperationAppEventListener(PaymentServiceStockOperationPublishChannel stockOperationPublishChannel) {
        this.stockOperationPublishChannel = stockOperationPublishChannel;
    }

    @EventListener(Payment.class)
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onCommonDataChanged(Payment payment) {
        stockOperationPublishChannel.outputChannel().send(MessageBuilder.withPayload(payment).build());
    }
}
