/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinsertionsort;

/**
 *
 * @author simon
 */
public class PrjInsertionSort {

    public static void main(String[] args) {
        final int SIZE = 5;
        
        int[] sumNums = {90,85,65,95,75};
        int i = 0;
        int p = 0;
        int temp = 0;
        
        p = 1;//first considered sorted
        
        
        while(p < SIZE){
            temp = sumNums[p];
            i = p -1;
            
            while(i >= 0 && sumNums[i] > temp){
                sumNums[i+1] = sumNums[i];
                i--;
            }
            sumNums[i+1] = temp;
            p =  p+1;
        }
        System.out.println("ArrSorted ");
        
        for(int num : sumNums){
            System.out.println(num + " ");
        }
    }
}
