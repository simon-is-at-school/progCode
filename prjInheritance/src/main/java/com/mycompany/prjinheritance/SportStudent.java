/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author simon
 */
public class SportStudent extends Student{ //NB!!
    
    public SportStudent( String name){
            super(name);//class parent 
    }
    public String playSport(){
        return name + " is playing Jai Alai";
    }
}
