/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjarrays4;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjArrays4 {

    public static String[] prod = new String[5];
    private static int[] quant = new int[5];

    public static void main(String[] args) {

        for (int i = 0; i < prod.length; i++) {
            prod[i] = JOptionPane.showInputDialog(null, "Please enter product " + (i + 1) + ":");
            quant[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity for " + prod[i] + ":"));
        }
        
        display();
        total();
        search();
    }

    public static void display() {
        StringBuilder sb = new StringBuilder("Products and their quantities\n");
        
        for(int i= 0;  i < prod.length; i++){
            sb.append(prod[i]).append(": ").append(quant[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb);
    }

   public static void total() {
        int total = 0;
        for (int q : quant){
            total += q;
        }
           JOptionPane.showMessageDialog(null, " TOTAL IS:  " + total);
    }

    public static void search() {
        String search = JOptionPane.showInputDialog(null, "Please enter name search: ");
        
        boolean b = false;
        
        
        
        
        for (int i = 0; i < prod.length; i++){
            if(prod[i].equalsIgnoreCase(search)){
                JOptionPane.showMessageDialog(null, "product found: " + prod[i] + "\nQuantity: " + quant[i]);
                
                b = true;
                break;
            }
        }
             if(!b){
                JOptionPane.showMessageDialog(null, "Product not found");
            }
    }
    
    
}
