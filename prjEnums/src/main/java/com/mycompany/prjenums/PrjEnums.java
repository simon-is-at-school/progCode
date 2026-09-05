/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjenums;

/**
 *
 * @author simon
 */
public class PrjEnums {
//enum = fixed set possible values like const..........
    
    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    
    
    public enum trafficLight{
        GREEN,
        ORANGE,
        RED
    }
    public static void main(String[] args) {
        Day today = Day.MONDAY;//day is data type, today is var , mon is value
        trafficLight tl = trafficLight.GREEN;
        System.out.println("Today is: " + today);
        System.out.println("Traffic light is: " + tl);
    }
}
