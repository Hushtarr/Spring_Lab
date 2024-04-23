package org.spring.lab_04.model;


import lombok.Getter;
import lombok.Setter;
import org.spring.lab_04.enums.QuantityType;

@Getter
@Setter
public class Ingredient
    {
    private String name;
    private int quantity;
    private QuantityType quantityType;
    }
