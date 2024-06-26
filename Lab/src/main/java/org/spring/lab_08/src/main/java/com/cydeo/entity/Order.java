package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor

public class Order extends BaseEntity{
    private BigDecimal paid_price;
    private BigDecimal total_price;

    @OneToOne
    private Cart cart;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Payment payment;
}
