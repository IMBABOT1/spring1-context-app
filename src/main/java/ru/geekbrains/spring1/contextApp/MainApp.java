package ru.geekbrains.spring1.contextApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.close();
    }
}
