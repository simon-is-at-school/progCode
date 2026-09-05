package com.mycompany.prjinherit3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author simon
 */
public class EmpB extends Person {

    private double sal;

    public EmpB(int ID, String name, double sal) {
        super(ID, name);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }3

    @Override
    public String disp() {
        return getID() + " " + getName() + " " + sal;
    }
}
