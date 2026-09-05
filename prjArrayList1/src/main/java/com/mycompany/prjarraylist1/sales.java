/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjarraylist1;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class sales {
      private ArrayList<Double> dblSales = new ArrayList<>();
      
      public void addSales(double dblSale){
          dblSales.add(dblSale);
          
      }
      
      public double calcTotal(){
          double dblTotal = 0.0;
          
          for(int i = 0; i < dblSales.size(); i++){
              dblTotal += dblSales.get(i);
          }
          
          return dblTotal;
      }
      
      public double calcAvg(){
          return calcTotal() / dblSales.size();
      }
}
