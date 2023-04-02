package com.Spring_framework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Losse_coupled_component {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Losse_coupled_component.class,args);
        Lc_2 aba= (Lc_2) context.getBean(String.valueOf(Lc_2.class));

        System.out.println("xml file loaded");

    }
}
