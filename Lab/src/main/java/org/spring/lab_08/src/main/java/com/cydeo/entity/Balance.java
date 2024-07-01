package com.cydeo.entity;

import jakarta.persistence.*;
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
    @Column(precision = 19, scale = 2) //p-> length of the digit, s-> length of decimal
    private BigDecimal amount;

    @OneToOne
    private Customer customer;

}
