/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays;

/**
 *
 * @author simon
 */
public class PrjArrays {

    public static void main(String[] args) {
        int [] intArray1 = new int [5];//declared and initalized the arr(dont know values)
        
        int [] intArray2 = {5,5,5,5,5}; // already know the values
        
        int [] intArray3;//plan int arr and allows to declare later
        
        intArray3 = new int[5];
        
        intArray3[0]=20;
        intArray3[1]=30;
        intArray3[2]=40;
        intArray3[3]=50;
         intArray3[4]=60;
         
         String [] strStudents = new String[20];
         String [] strEmp = {"Joe", "Jeff", "Jane"};
         
         String [] arrNames = new String[5];
         arrNames[0] ="Jason";
         arrNames[1]="Jason again";
         arrNames[2]="Jason again again";
         arrNames[3]="Jason again again again";
         arrNames[4]="Jason again again again again";
         
         
         for (int index = 0; index < arrNames.length; index++){
             System.out.println("Index position " + index + ": " + arrNames[index]);
        }
    }
}
