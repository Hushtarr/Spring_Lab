package org.spring.lab_03.repository;

import org.spring.lab_03.model.Product;

public class Stock implements  Repository
    {
    @Override
    public boolean addToDatabase(Product product, int quantity)
        {
        System.out.println(product.getQuantity() + " " + product.getName() + " is added to database");
        return true;
        }
    }
