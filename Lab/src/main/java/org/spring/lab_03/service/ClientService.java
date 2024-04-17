package org.spring.lab_03.service;



import org.spring.lab_03.model.Cart;
import org.spring.lab_03.model.Product;
import org.spring.lab_03.repository.CartRepo;
import org.spring.lab_03.repository.StockRepo;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ClientService implements Service
    {
    private final CartRepo cartRepository;
    private final StockRepo stockRepository;

    public ClientService(CartRepo cartRepository, StockRepo stockRepository)
        {
        this.cartRepository = cartRepository;
        this.stockRepository = stockRepository;
        }

    public void check(Product product)
        {
        cartRepository.checkTheDatabase(product);
        }

    public void addToCart(Cart cart,Product product)
        {
        Map<Product,Integer> addedProduct =new HashMap<>();
        addedProduct.put(product,20);

        }


    }
