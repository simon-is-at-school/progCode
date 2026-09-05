/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjbubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjBubbleSort {

    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
////        int SIZE = 10;
//        int SIZE = 15;
//        int[] array = new int[SIZE];
//        int temp;
//        String c = "";
//
//        for (int d = 0; d < array.length; d++) {
//            array[d] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (d + 1)));
//
//        }
//
//        for (a = 0; a < array.length; a++) {
//            for (b = 0; b < array.length - 1; b++) {
//                if (array[b + 1] > array[b]) {
//                    temp = array[b];
//                    array[b] = array[b + 1];
//                    array[b + 1] = temp;
//                }
//            }
//        }
//        
////
////        for (a = 0; a < array.length - 1; a++) {
////            for (b = 0; b < array.length - 1; b++) {
////                if (array[b] > array[b + 1]) {
////                    temp = array[b + 1];
////                    array[b + 1] = array[b];
////                    array[b] = temp;
////
////                }
////            }
////        }
////
//    for (int d = 0; d < array.length; d++) {
//                c += array[d] + ",";
//            }
////
////        for (int d = 0; d < array.length; d++) {
////            c += array[array.length-1 -d] + ",";
////        }
////
//        JOptionPane.showMessageDialog(null, c);
//        
        
        int[] array = new int[3];

        array[0] = 389;
        array[1] = 988;
        array[2] = 155;

        int temp;
        String d = "Numbers before the bubble sort: \n\n";

        display(array, d);

        for (int i1 = 0; i1 < array.length - 1; i1++){

            for (int i2 = 0; i2 < array.length - 1 - i1; i2++){

                if (array[i2] > array[i2+1]){

                   temp = array[i2];
                   array[i2] = array[i2+1];
                   array[i2+1] = temp;

                }

            }


        }

        d = "Numbers after the bubble sort: \n\n";

        display(array, d);

    }

    public static void display(int[] array, String d) {

        String n = "";

        for (int c = 0;c<array.length;c++){
            n += array[c] + "   ";
        }

        JOptionPane.showMessageDialog(null,d + n + "\n\n");
    }
}

