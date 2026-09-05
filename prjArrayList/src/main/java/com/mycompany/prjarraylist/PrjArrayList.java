/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarraylist;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class PrjArrayList {

    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();//grows and shrinks so arr always populated
      
      loadArrayList(names);
      
      printArrayList(names);
    }

    private static void loadArrayList(ArrayList<String> names) {
        names.add("Tiaan");
        names.add("Simon");
        names.add("Bob the Builder");
        names.add("Jason idk");
    }

    private static void printArrayList(ArrayList<String> names) {
        String strDisplayNames = "Captured Names";
        
        for(int index = 0; index < names.size(); index++){
            strDisplayNames += names.get(index) + "\n";
        }
        
        System.out.println(strDisplayNames);
    }
}
