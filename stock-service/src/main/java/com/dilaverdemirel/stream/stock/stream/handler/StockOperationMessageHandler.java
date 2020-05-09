package com.dilaverdemirel.stream.stock.stream.handler;

import com.dilaverdemirel.stream.stock.domain.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import static com.dilaverdemirel.stream.stock.stream.channel.StockOperationChannel.DEAD_LETTER_QUEUE;
import static com.dilaverdemirel.stream.stock.stream.channel.StockOperationChannel.INPUT_CHANNEL;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Slf4j
@Service
public class StockOperationMessageHandler {
    @StreamListener(INPUT_CHANNEL)
    public void handleMessage(Payment payment) {
        log.debug("Handled stock operation message that {}", payment);
        if (payment.getPrice() == -1) {
            throw new RuntimeException("price exception!");
        }
    }

    @RabbitListener(queues = DEAD_LETTER_QUEUE)
    public void handleDLQMessage(Message failedMessage) {
        log.debug("Unhandled stock operation message that {}", failedMessage);
    }
}
