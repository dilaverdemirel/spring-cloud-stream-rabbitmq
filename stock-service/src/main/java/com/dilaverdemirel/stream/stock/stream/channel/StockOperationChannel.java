package com.dilaverdemirel.stream.stock.stream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
public interface StockOperationChannel {
    String INPUT_CHANNEL = "stockOperationInputChannel";
    String DESTINATION = "stock-service.operation.stock-service-group";
    String DEAD_LETTER_QUEUE = DESTINATION + ".dlq";

    @Input(INPUT_CHANNEL)
    MessageChannel inputChannel();
}
