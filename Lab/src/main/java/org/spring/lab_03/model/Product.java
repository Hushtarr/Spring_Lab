package org.spring.lab_03.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@Component

public class Product
    {

    private String name;
    private BigDecimal price;
    }
