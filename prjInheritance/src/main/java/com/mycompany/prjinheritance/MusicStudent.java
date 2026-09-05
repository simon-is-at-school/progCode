/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author simon
 */
public class MusicStudent extends Student{
    public MusicStudent( String name){
        super(name);
    }
    
    public String pracIntrument(){
        return name + " is playing the The Theremin";
    }
}
