/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
package com.mycompany.prjarray6;

/**
 *
 
@author simon*/
public class StudentManagement {

    private String[] names;
    private int[] ages;
    private String[] courses;
    private double marks[];

    private int size;

    //don't disclose size, it don't matter;

    public StudentManagement(String[] names, int[] ages, String[] courses, double[] marks){

        this.names = names;
        this.ages = ages;
        this.courses = courses;
        this.marks = marks;
        this.size = names.length; //size (not disclosed)

    }

    public int search(String find){

        for ( int i = 0; i < size; i++){

            if (names[i].equalsIgnoreCase(find)&& names[i] != null){
                return i;
            } 

        }

        return  -1;

    }

    public void update(int i, double mark){

       marks[i] = mark; 

    }
    
    public String display(){
        String disp = "\n--- STUDENT LIST ---\n";
        
        for(int i= 0; i < size; i++){
            disp += sd(i) + "\n";
    }
        return disp;
    }
    
    public String sd(int i){
        return names[i] + " | " + ages[i] + " | " + courses[i] + " | " + marks[i] + " | "; 
    }
}