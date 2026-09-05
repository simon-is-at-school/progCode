/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarraysrevision;

/**
 *
 * @author simon
 */
public class PrjArraysRevision {

    public static void main(String[] args) {
        
        int[] array = new int[6];
        int sum = 0;
        
        array[0] = 12;
        array[1] = 7;
        array[2] = 9;
        array[3] = 21;
        array[4] = 5;
        array[5] = 14;
        
        for(int i = 0; i < array.length; i++){
            
            System.out.println(array[i]);
            sum = sum + array[i];
            
        }
        System.out.println("The Total is :" + sum);
        
    }
}
