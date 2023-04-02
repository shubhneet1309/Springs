package com.Spring_framework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lc_2 {
    @Autowired
    private Lc_1 lc_1;
    public Lc_2(Lc_1 lc_1){
        this.lc_1=lc_1;
    }
    public void Lc_1(){
        System.out.println("interface Lc_1");
    }
}
