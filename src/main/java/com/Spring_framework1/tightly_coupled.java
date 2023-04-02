package com.Spring_framework1;

public class tightly_coupled {
    public static void main(String[] args)
    {
        tc_1 a=new tc_1();
        tc_2 b=new tc_2();
        a.abcd();
        b.abcd();
    }
}
