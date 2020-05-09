package com.dilaverdemirel.stream.payment.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author dilaverdemirel
 * @since 4.05.2020
 */
@Getter
@Setter
@Entity
public class Payment {
    @Id
    private String id;
    private String stockItemId;
    private Double price;
    private Integer quantity;
}
