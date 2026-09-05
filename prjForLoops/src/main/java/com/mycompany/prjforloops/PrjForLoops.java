/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjforloops;

/**
 *
 * @author simon
 */
public class PrjForLoops {

    public static void main(String[] args) {

//      for (int intInput=0; intInput <3; intInput++){
//          System.out.println("Hi" + (intInput +1));
//      }
//      
//      
//      for(int intNumber=1; intNumber <=10; intNumber++){
//          System.out.println("4x " + intNumber + " = " +  (4 * intNumber) );
//      }
        int intYear;
        final int intStartYear = 2015;
        final int intIncrement = 5;
        int intEndYear;
        

        
        intEndYear = intStartYear + 30;
        
        for (intYear = intStartYear; intYear <=intEndYear; intYear += intIncrement){
            System.out.println(intYear);
        }
    }
}
