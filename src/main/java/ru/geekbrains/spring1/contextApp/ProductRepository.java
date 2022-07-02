package ru.geekbrains.spring1.contextApp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts(){
        return products;
    }
    @PostConstruct
    public void init(){
        products = new ArrayList<>(Arrays.asList(
                new Product(1l, "milk", 80),
                new Product(2l, "bread", 50),
                new Product(3l, "water", 30),
                new Product(4l, "meat", 300),
                new Product(5l, "cheese", 150)
        ));
    }

    public Product getProductByID(Long id){
        for (Product p: products){
            if (p.getId().equals(id)){
                return p;
            }
        }
        throw new RuntimeException("Product with id: " + id + "doesn't exist");
    }

    public List<Product> getAllProducts(){
        return Collections.unmodifiableList(products);
    }
}
