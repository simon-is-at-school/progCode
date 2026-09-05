/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism1;

/**
 *
 * @author simon
 */
public class EmailNotification extends Notifications {
    @Override
    public String send(){
        return "Sending email notification";
    }
}
