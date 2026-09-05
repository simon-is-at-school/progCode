/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinheritance1;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjInheritance1 {

    public static void main(String[] args) {
        String strChoice = JOptionPane.showInputDialog(null, "Please enter your sport event" + "\n Tennis, Cricket, Golf, Soccer");

        SportEvent event = new SportEvent(strChoice);

        if (event.getFee() == 0) {
            JOptionPane.showMessageDialog(null, "No fees pls make sure you selected a correct option");
        } else {
            JOptionPane.showMessageDialog(null, "SPORT EVENT: " + strChoice.toUpperCase() + "\n EVENT FEE: R" + event.getFee());
        }
    }
}
