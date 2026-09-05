/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjenum1;

/**
 *
 * @author simon
 */
public class Coffee {
    
    public enum Size{
        SMALL,
        MEDIUM,
        LARGE
    }
    
    private String name;
    private Size size;// size enum as data type
    
    public Coffee(String strName, Size size){
        this.name = name;
        this.size = size;
    }
    
    public String getName(){
        return name;
    }
    
    public Size getSize(){
        return size;
    }
    
    
}
