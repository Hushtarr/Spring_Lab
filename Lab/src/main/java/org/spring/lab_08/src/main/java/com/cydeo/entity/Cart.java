package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor

public class Cart extends BaseEntity{
    private String cart_state;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Discount discount;
}
