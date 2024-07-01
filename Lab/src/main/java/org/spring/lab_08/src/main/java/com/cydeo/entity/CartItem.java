package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity{
    private Integer quantity;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;



}
