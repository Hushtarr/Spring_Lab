package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor

public class Address extends BaseEntity{
    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
//    @JoinColumn(name = "customer_id")
    private Customer customer;
}
