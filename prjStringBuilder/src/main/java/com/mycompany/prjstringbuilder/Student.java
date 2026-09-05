/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjstringbuilder;

/**
 *
 * @author simon
 */
public class Student {

    private String name;
    private int total;
    private int avg;
    private String result;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public void calcResult() {
        avg = total / 3;
        if (avg >= 50) {
            result = "pass";
        } else {
            result = " fail";
        }
    }
    
    public String getName(){
        return name;
    }
    
    public int getTotal(){
        return total;
    }
    
    public String getResult(){
        return result;
    }
    
    public int getAvg(){
        return avg;
    }

}
