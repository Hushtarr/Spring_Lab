package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "discount")
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity{
    private BigDecimal discount;
    private String discount_type;
    private String name;
}
