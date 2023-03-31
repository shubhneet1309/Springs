package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.FileSystem;

public class Test1 {
    public static void main(String[] args){
        System.out.println("HEllO World");
        ApplicationContext context= new FileSystemXmlApplicationContext("src/main/java/org/example/test1.xml");
        Main test =context.getBean(Main.class);

        System.out.println(test);

    }
}
