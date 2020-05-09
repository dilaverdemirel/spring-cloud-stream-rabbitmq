package com.dilaverdemirel.stream;

import com.dilaverdemirel.stream.payment.stream.channel.PaymentServiceStockOperationPublishChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({
        PaymentServiceStockOperationPublishChannel.class
})
@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}
