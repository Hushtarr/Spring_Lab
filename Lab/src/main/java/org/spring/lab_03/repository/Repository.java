package org.spring.lab_03.repository;


import org.spring.lab_03.model.Product;

import java.util.List;

public interface Repository {

    boolean addToDatabase(Product product, int quantity);

    boolean removeFromDatabase(Product product ,int quantity);

    List<String> checkTheDatabase(Product product );


}
