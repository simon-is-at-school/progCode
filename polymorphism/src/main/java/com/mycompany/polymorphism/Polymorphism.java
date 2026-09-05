/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author simon
 */
public class Polymorphism {

    public static void main(String[] args) {
        Pizza piz = new Pizza();
        
        System.out.println(piz.order("Chicken"));
         System.out.println(piz.order("Chicken", "Pineapple"));
         System.out.println(piz.order());
         System.out.println(piz.order(1000));
    }
}
 