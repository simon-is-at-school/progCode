package com.mycompany.polymorphism;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simon
 */
public class Pizza {
    public String order(String toppingA){
        return "Topping on the pizza: " + toppingA;
    }
    
    public String order(String toppingA, String toppingB){
        return "Topping on the pizza: " + toppingA + " and " + toppingB;
    }
    
    public String order(){
        return "Plain, no toppings";
    }
    
    public String order(int qty){
        return qty + "Pizza bases";
    }
}
