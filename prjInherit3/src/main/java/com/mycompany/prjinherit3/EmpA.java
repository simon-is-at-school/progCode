/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherit3;

/**
 *
 * @author simon
 */
public class EmpA extends Person {
    
    
    private double sal;
    public EmpA(int ID, String name, double sal){
        super(ID, name);
        this.sal = sal;
    }
    
    public double getSal(){
        return sal;
    }
    
    @Override
    public String disp(){
        return getID() + " " + getName() + " " + sal;
    }
}
