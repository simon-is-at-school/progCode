/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjforloops2;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class PrjForLoops2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      for(int intIndex=1; intIndex<=3; intIndex++ ){
          System.out.println("Please enter Student Number for Student:  " + intIndex );
          int intStudentNumber = scan.nextInt();
          
          Student s = new Student(intStudentNumber);
          
          System.out.println("Welcome, Student #" + s.getStudentNumber());
      }
    }
}
