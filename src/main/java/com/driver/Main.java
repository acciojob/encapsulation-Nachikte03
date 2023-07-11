package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly p = new RWOnly();
        //p.name = "p";
        setName("p");
        System.out.pritnln(getName());
    }
}