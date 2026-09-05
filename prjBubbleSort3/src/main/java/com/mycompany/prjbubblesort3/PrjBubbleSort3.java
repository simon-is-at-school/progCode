/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubblesort3;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjBubbleSort3 {

    public static void main(String[] args) {
        final int SIZE = 5;
        String[] strNames = new String[SIZE];
        
        for(int i = 0; i < SIZE; i++){
            strNames[i] = JOptionPane.showInputDialog(null, "Enter name number " + (i+1) + ":");
    }
          bubbleSort(strNames, SIZE);
          dispNames(strNames);
}

    private static void bubbleSort(String[] strNames, int SIZE) {
        for(int i = 0; i < SIZE - 1; i++){
            for (int j = 0; j < SIZE - 1; j++){
                if(strNames[j].compareToIgnoreCase(strNames[j+1]) > 0){
                    String temp = strNames[j];
                    strNames[j] = strNames[j+1];
                    strNames[j+1] = temp;
                }
            }
        }
    }

    private static void dispNames(String[] strNames) {
        
        String strDisplay = "Sorted Names: \n";
        for(String strName : strNames){
            strDisplay += strName + "\n";
        }
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }
    
  
}
