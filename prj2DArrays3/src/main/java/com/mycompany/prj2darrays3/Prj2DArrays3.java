/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prj2darrays3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
  

    public class Prj2DArrays3 {

        public static void main(String[] args) {
            String[][] strStudents = {{"ST101", "Joe Bloggs", "55"}, {"ST102", "Same Sparks", "45"}, {"ST103", "Jeff Jones", "75"}};

            String strChoice = JOptionPane.showInputDialog(null, "Press 1 to print all or any other key for individual results");

            if (strChoice.equals("1")) {
                displayResults(strStudents);
            } else {
                individualResults(strStudents);
            }
        }

        private static void displayResults(String[][] strStudents) {
            String strDisplay = "";
            double dblTotal = 0.0;

            DecimalFormat form = new DecimalFormat("#0");

            for (int index = 0; index < strStudents.length; index++) {
                for (int count = 0; count < strStudents.length; count++) {
                    strDisplay += strStudents[index][count] + " ";
                }
                dblTotal += Double.parseDouble(strStudents[index][2]);
                strDisplay += "\n";
            }
            JOptionPane.showMessageDialog(null, strDisplay + "\n" + "Average: " + form.format(dblTotal / strStudents.length) + "%");

        }
    }

    private static void individualResults(String[][] strStudents) {
        String strID = JOptionPane.showInputDialog(null, "Please enter Student number");
        for (int index = 0; index < strStudents.length; index++) {
            if (strID.equalsIgnoreCase(strStudents[index][0])) {
                JOptionPane.showMessageDialog(null, "StudentNumber: " + strStudents[index][0] + "\n" + "Student Name: " + strStudents[index][1] + "\n" + "Student Results" + strStudents[index][2] + "%");
            }
        }
    }
