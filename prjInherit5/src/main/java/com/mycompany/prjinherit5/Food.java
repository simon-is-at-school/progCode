/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherit5;

/**
 *
 * @author simon
 */
public class Food extends MenuItem {
    
    
    private boolean veg;
    public Food(String name, double price,  boolean veg) {
        super(name, price, Category.FOOD);
        
        this.veg = veg;
    }
    
    public boolean isVeg(){
        return veg;
    }
    
    @Override
    public String displayItem(){
        return super.displayItem() + "\nVeg: " + veg; 
    }
}
