/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance2;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjInheritance2 {

    public static void main(String[] args) {
       String strType = JOptionPane.showInputDialog(null," Please enter employee type: 1 Normal or 2 Overtime");
       
       String strName = JOptionPane.showInputDialog(null, "Please enter  employee name: ");
       
       double dblBaseSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Base salary"));
       
       Employee emp;
       
       if(strType.equals("2")){
           int intOvetimeHours = Integer.parseInt(JOptionPane.showInputDialog(null, "enter hours"));
           
           double dblOverTimeRate = Double.parseDouble(JOptionPane.showInputDialog(null,"enter rate per hour"));
           
           emp = new OvertimeEmployee(strName, dblBaseSalary, intOvetimeHours, dblOverTimeRate);
       }else{
           emp = new Employee(strName, dblBaseSalary);
           
       }
       JOptionPane.showMessageDialog(null, emp.getName() + " Pay: R" + emp.calcPay());
    }
}
