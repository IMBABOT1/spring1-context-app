package ru.geekbrains.spring1.contextApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private List<Product> list;
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init(){
        list = new ArrayList<>();
    }

    public void addProduct(Long id){
        list.add(productRepository.getProductByID(id));
    }

    public void deleteProduct(Long id){
        list.remove(productRepository.getProductByID(id));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Product p: list){
            sb.append(p);
            sb.append("]");
            sb.append("\n");
            sb.append("[");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
