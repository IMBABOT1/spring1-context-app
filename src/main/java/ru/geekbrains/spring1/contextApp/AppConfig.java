package ru.geekbrains.spring1.contextApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"ru.geekbrains.spring1.contextApp"})
public class AppConfig {
}
