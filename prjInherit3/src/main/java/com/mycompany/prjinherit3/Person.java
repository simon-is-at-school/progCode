/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherit3;

/**
 *
 * @author simon
 */
public class Person {
    private int ID;
    private String name;
    
    public Person(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    
    public String disp(){
        return ID + " " + name;
    }
    
    public final String dont(){
        return " fuck off";
    }
}
