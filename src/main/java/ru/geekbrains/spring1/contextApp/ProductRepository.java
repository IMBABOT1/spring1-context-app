package ru.geekbrains.spring1.contextApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts(){
        return products;
    }
}
