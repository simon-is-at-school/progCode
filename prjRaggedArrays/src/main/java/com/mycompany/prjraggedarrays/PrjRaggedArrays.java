/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjraggedarrays;

/**
 *
 * @author simon
 */
public class PrjRaggedArrays {

    public static void main(String[] args) {
       String [][] strFruits = {
           {"Apple","Banana"},
           {"Orange","Pear", "Grapes"},
           {"Mango"}
       };
       
       for(int row = 0; row < strFruits.length; row++){
           System.out.println("Row" + row);
           for(int col = 0; col < strFruits[row].length; col++){
               System.out.println(strFruits[row][col]);
           }
           System.out.println();
       }
    }
}
