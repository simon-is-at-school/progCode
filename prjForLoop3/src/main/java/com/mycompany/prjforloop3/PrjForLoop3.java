/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjforloop3;

import javax.swing.JOptionPane;
a
 *
 * @author simon
 */
public class PrjForLoop3 {

    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            String b = JOptionPane.showInputDialog(null,"Please enter book name for book number: " + i);
            
            book book = new book(b);
            
            JOptionPane.showMessageDialog(null, "Book name for book "+ i +" : " + book.getb());
            
            
        }
        
     
    }
}
