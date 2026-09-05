/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjstringbuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjStringBuilder {

    public static void main(String[] args) {
        String name;
        String input;
        int mark;
        int total = 0;
        final int TEST = 3;

        name = JOptionPane.showInputDialog(null, "Please enter your student name: ");

        StringBuilder sb = new StringBuilder();

        for (int count = 1; count <= TEST; count++) {
            input = JOptionPane.showInputDialog(null, "Please enter your mark for test: " + count );
            mark = Integer.parseInt(input);
            total = total + mark;
            
            sb.append("Test ").append(count).append(": ").append(mark).append("\n");
        }
        
        Student s = new Student(name,total);
        
        s.calcResult();
        
        sb.insert(0, "Student Report \n\n");
        
        sb.append("\nStudent Name:  ").append(s.getName()).
                append("\nTotal:  ").append(s.getTotal()).
                append("\nAverage:  ").append(s.getAvg()).
                append("\nResult:  ").append(s.getResult());
        
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
}
