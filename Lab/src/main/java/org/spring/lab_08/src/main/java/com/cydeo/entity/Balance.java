package com.cydeo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "balance")
@Getter
@Setter
@NoArgsConstructor

public class Balance extends BaseEntity {
    @Column(precision = 19, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    private Customer customer;

}
