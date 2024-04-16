package org.spring.lab_03.repository;

import org.spring.lab_03.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StockRepo implements  Repository
    {
    List<Product> products = new ArrayList<>();


    public boolean addToDatabase(Product product, int quantity)
        {
        products.add(product);
        System.out.println(quantity + " " + product.getName() + " is added to Cart");
        return true;
        }

    public boolean removeFromDatabase(Product product, int quantity)
        {
        products.remove(product);
        System.out.println(quantity + " " + product.getName() + " is removed from Cart");
        return true;
        }

    @Override
    public List<String> checkTheDatabase(Product product)
        {
        return product.getName().lines().toList();
        }
    }
