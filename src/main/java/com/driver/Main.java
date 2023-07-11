package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly p = new RWOnly();
        // p.name = "p";
        p.setName("p");
        System.out.println(p.getName());
    }
}