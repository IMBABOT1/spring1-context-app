package ru.geekbrains.spring1.contextApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean("cart", Cart.class);



        while (true){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.equals("/add_1")){
                cart.addProduct(1l);
            }else if (line.equals("/add_2")){
                cart.addProduct(2l);
            }else if (line.equals("/add_3")){
                cart.addProduct(3l);
            }else if (line.equals("/add_4")){
                cart.addProduct(4l);
            }else if (line.equals("/add_5")){
                cart.addProduct(5l);
            }else if (line.equals("/dell_1")){
                cart.deleteProduct(1l);
            }else if (line.equals("/dell_2")){
                cart.deleteProduct(2l);
            }else if (line.equals("/dell_3")){
                cart.deleteProduct(3l);
            }else if (line.equals("/dell_4")){
                cart.deleteProduct(4l);
            }else if (line.equals("/dell_5")){
                cart.deleteProduct(5l);
            }else if (line.equals("/getProducts")){
                System.out.println(cart);
            }else if (line.equals("/end")){
            }
            context.close();
        }
    }
}
