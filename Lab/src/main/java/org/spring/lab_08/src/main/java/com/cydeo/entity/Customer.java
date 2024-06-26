package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{
    private String email;
    private String firstName;
    private String lastName;
    private String userName;
}
