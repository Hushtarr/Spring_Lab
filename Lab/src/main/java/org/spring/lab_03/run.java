package org.spring.lab_03;

import org.spring.lab_03.config.ConfigApp;
import org.spring.lab_03.model.Cart;
import org.spring.lab_03.model.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Random;
import java.util.random.RandomGenerator;

public class run
    {
    public static void main(String[] args)
        {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Product milk =container.getBean(Product.class);
        milk.setName("milk");
        milk.setPrice(BigDecimal.valueOf(2));
        milk.setQuantity(10);





        }
    }
