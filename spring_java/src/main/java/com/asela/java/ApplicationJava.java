package com.asela.java;

import com.asela.java.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan({"com.asela.java"})
@PropertySource("application.properties")
public class ApplicationJava {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationJava.class);
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println("service.findAll().get(0).getFirstName() = " + service.findAll().get(0).getFirstName());

        System.out.println("service = " + service);
        System.out.println("new service = " + applicationContext.getBean("customerService"));
    }
}
