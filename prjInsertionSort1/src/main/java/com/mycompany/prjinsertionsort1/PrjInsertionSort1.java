/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinsertionsort1;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class PrjInsertionSort1 {

    public static void main(String[] args) {

        int[] nums = {500, 300, 700, 200, 900};
        String strMessage = "Numbers Before Sorting: ";

        dispNums(nums, strMessage);

        String options = JOptionPane.showInputDialog(null, "Choose method:\n\n" + "1:Bubble Sort(Ascending)\n" + "2:Bubble Sort(Descending)\n" + "3:Insertion Sort");

        switch (options) {
            case "1":
                bubbleSort(nums, "Numbers After Sorting: \n\n", "1");
                break;
            case "2":
                bubbleSort(nums, "Numbers After Sorting: \n\n", "2");
                break;
            case "3":
                insertionSort(nums, "Numbers After Sorting: \n\n", "3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please Select a Valid option");
        }

    }

    private static void bubbleSort(int[] nums, String nums_after_sort, String string) {
        int temp = 0;

        if (string.equals("1")) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j + 1] < nums[j]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
            String c = "";
            for (int q = 0; q < nums.length; q++) {
                c += nums[q] + " ";
            }

            JOptionPane.showMessageDialog(null, nums_after_sort + c);
        }
        
        
        if(string.equals("2")){
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < nums.length -1; j++){
                    if (nums[j] < nums[j+1]){
                        temp = nums[j+1];
                        nums[j+1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            String c = "";
            for (int q = 0; q < nums.length; q++) {
                c += nums[q] + " ";
            }

            JOptionPane.showMessageDialog(null, nums_after_sort + c);
        }
    }

    private static void insertionSort(int[] nums, String nums_after_sort, String string) {
        int i = 0;
        int p = 0;
        int temp = 0;
        
        p = 1;// Is considered sorted
        
        while(p < nums.length){
            temp = nums[p];
            
            i = p - 1;
            
            while(i >= 0 && nums[i] > temp){
                nums[i+1] = nums[i];
                i--;
                
            }
            nums[i+1] = temp;
            p = p + 1;
        }
         String c = "";
            for (int q = 0; q < nums.length; q++) {
                c += nums[q] + " ";
            }

            JOptionPane.showMessageDialog(null, nums_after_sort + c);
        
    }

    private static void dispNums(int[] nums, String strMessage) {
        String c = "";
        for (int q = 0; q < nums.length; q++) {
            c += nums[q] + " ";
        }

        JOptionPane.showMessageDialog(null, strMessage + c);
    }

}
