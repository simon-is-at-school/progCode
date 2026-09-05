/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author simon
 */
public class ArtStudent extends Student{ //nb!
    
    public ArtStudent (String name){
            super(name);
    }
    
    public String isPainting(){
        return name + " is painting The Garden of Earthly Delights";
    }
}
