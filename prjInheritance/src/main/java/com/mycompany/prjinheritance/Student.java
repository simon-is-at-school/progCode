/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author simon
 */
public class Student {
    protected String name;

    public Student (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //commmon methods for all students and  will be inherited by child classes

    public String attendClass(){
        return name + " is attending class";
    }

    public String submitAssignment(){
        return name + " submitted an assignment";
    }
}
