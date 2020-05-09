package com.dilaverdemirel.stream.payment.stream.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
public interface PaymentServiceStockOperationPublishChannel {
    String OUTPUT_CHANNEL = "stockOperationOutputChannel";

    //Stok işlemlerinin yapılması için gereken mesajın gönderimini sağlamak için
    @Output(OUTPUT_CHANNEL)
    MessageChannel outputChannel();
}
