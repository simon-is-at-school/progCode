/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.polymorphism1;

/**
 *
 * @author simon
 */
public class Polymorphism1 {

    public static void main(String[] args) {
        Notifications n = new Notifications();
        System.out.println(n.send());
        n = new EmailNotification();
        System.out.println(n.send());
        n = new SMSnotification();
        System.out.println(n.send());

    }
}
