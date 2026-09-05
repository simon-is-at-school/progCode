/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prj2darrays;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class Prj2darrays {

    public static void main(String[] args) {
        int[][] rent = {{400, 450, 510},
        {500, 560, 630},
        {625, 675, 740},
        {1000, 1250, 1600}};
        
        int intFloor;
        int intBedroom;
        
        intFloor = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter floor num"));
        intBedroom = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number of bedrooms"));
        
        JOptionPane.showMessageDialog(null,"The rent for a " + intBedroom + "bedroom apartment on floor" + intFloor + "is R" + rent[intFloor][intBedroom]);
    }
}

