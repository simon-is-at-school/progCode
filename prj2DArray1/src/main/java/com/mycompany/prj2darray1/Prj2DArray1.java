/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prj2darray1;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class Prj2DArray1 {

    public static void main(String[] args) {
        String[][] tpa = {
            {"Cape Town", "35", "8"},
            {"Johannesburg", "37", "5"},
            {"Pretoria", "37", "6"},
            {"Bloemfontein", "38", "3"},
            {"Port Elizabeth", "33", "10"},
            {"Durban", "35", "12"}
        };

        display(tpa);
    }

    private static void display(String[][] tpa) {
        String strDisplay = "Weather Temp:\n\n";
        for (int i = 0; i < tpa.length; i++) {
            strDisplay += "City: " + tpa[i][0] + "\n"
                    + "Highest: " + tpa[i][1] + "\n"
                    + "Lowest: " + tpa[i][2] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, strDisplay);
    }

}
