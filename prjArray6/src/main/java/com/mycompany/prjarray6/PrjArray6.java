/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjarray6;

import java.util.*;

/**
 *
 * @author simon
 */
public class PrjArray6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final int size = 4;

        String[] names = new String[size];
        int[] ages = new int[size];
        String[] courses = new String[size];
        double marks[] = new double[size];
        
        System.out.println("---StudentDATA---");
        
        for(int i = 0; i < size; i++){
            System.out.println("\n---Student" + (i + 1) + "---");
            System.out.println("Name: ");
            names[i] = s.nextLine();
            
            System.out.println("Age: ");
            ages[i] = s.nextInt();
            s.nextLine();
            
            System.out.println("Course: ");
            courses[i] = s.nextLine();
        }
        StudentManagement sm = new StudentManagement(names, ages, courses, marks);
        
        System.out.println(sm.display());
        
        sc(sm, s);
        ud(sm, s);
    }

    private static void sc(StudentManagement sm, Scanner s) {
        System.out.println("Search name: ");
        String f = s.nextLine();
        
        int i = sm.search(f);
        
        if(i != -1){
            System.out.println("Student Found: " + sm.sd(i));
        }else{
            System.out.println("Student not found");
        }
    }

    private static void ud(StudentManagement sm, Scanner s) {
        System.out.println("\nUpdate name: ");
        String n = s.nextLine();
        
        int u = sm.search(n);
        
        if(u != -1){
            System.out.println("New Mark:");
            double m = Double.parseDouble(s.nextLine());
            sm.update(u, m);
            System.out.println("Updated");
            
            System.out.println(sm.display());
        }else{
            System.out.println("name no found");
        }
        
        
    }
    
    
}
