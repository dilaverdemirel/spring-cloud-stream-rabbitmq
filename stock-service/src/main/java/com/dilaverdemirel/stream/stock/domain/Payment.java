package com.dilaverdemirel.stream.stock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Getter
@Setter
@ToString
public class Payment {
    private String stockItemId;
    private Double price;
    private Integer quantity;
}
