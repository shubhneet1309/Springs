package com.Spring_framework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface myInterface3{
    void showMarks();
}
@Component
@Qualifier("student5")
@Primary
class Student5 implements myInterface3{

    @Override
    public void showMarks() {
        System.out.println("Student1 passed");
    }
}
@Component
@Qualifier("student6")
class Student6 implements myInterface3{
    @Override
    public void showMarks() {
        System.out.println("Student2 Failed");
    }
}

@Component
class Result3{
    private myInterface3 obj;
    @Autowired
    public Result3(myInterface3 obj) {
        this.obj = obj;
    }

    public void display(){
        obj.showMarks();
    }
}
@SpringBootApplication
public class Ques_6 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ques_6.class);
        Result3 res = context.getBean(Result3.class);
        res.display();
        System.out.println(res);
    }

}
