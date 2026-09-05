/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjenum1;

/**
 *
 * @author simon
 */
public class PrjEnum1 {

    public static void main(String[] args) {

        Coffee order = new Coffee("Cappucinno", Coffee.Size.LARGE);

        System.out.println("Coffee:  " + order.getName());
        System.out.println("Size: " + order.getSize());

        switch (order.getSize()) {
            case SMALL:
                System.out.println("Small selected");
                break;
            case MEDIUM:
                System.out.println("Medium selected");
                break;
            case LARGE:
                System.out.println("Large selected");
                break;
        }

    }
}
