/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinherit5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author simon
 */
public class PrjInherit5 {

    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<MenuItem> order = new ArrayList<>();
    private static int[][] tables
            = {
                {0, 0, 0},
                {0, 0, 0}
            };

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 7) {
            displayMenu();
            System.out.print("Please enter a choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addFood();
                    break;

                case 2:
                    addDrink();
                    break;

                case 3:
                    viewOrder();
                    break;
                case 4:
                    viewTables();
                case 5:
                    allocateSeat();
                    break;
                case 6:
                    deallocateSeat();
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--------------------------------------------------------------------------------\n" + "                           Food ordering system" + "\n--------------------------------------------------------------------------------\n"
                + "1.Add food\n" + "2.Add drink\n" + "3.View order\n" + "4.View table\n" + "5.Allocate seat\n" + "6.Deallocate seat\n" + "7.Exit" + "\n--------------------------------------------------------------------------------\n");
    }

    private static void addFood() {
        System.out.println("\n----- Add food ----");
        System.out.println("Pls enter food name");
        String name = scan.nextLine();

        System.out.println("pls enter price");
        double price = scan.nextDouble();

        System.out.println("Is it vegatarian???????(true or false cuh)");
        boolean veg = scan.nextBoolean();

        scan.nextLine();

        Food food = new Food(name, price, veg);

        order.add(food);
        System.out.println("Food added");
    }

    private static void addDrink() {
        System.out.println("\n----- Add drink ----");
        System.out.println("Pls enter drink name");
        String name = scan.nextLine();

        System.out.println("pls enter price");
        double price = scan.nextDouble();

        scan.nextLine();

        System.out.println("pls enter size");
        String size = scan.nextLine();

        Drink drink = new Drink(name, price, size);

        order.add(drink);
        System.out.println("Drink added");
    }

    private static void viewOrder() {
        System.out.println("\n----- View order ----");
        if (order.isEmpty()) {
            System.out.println("Add food cuh");

        } else {
            for (MenuItem item : order) {
                System.out.println();
                System.out.println(item.displayItem());
                System.out.println("\n--------------------------------------------------------------------------------\n");
            }
        }
    }

    private static void viewTables() {
        System.out.println("\n----- Tables ----");
        for (int row = 0; row < tables.length; row++) {
            System.out.println("Table " + (row + 1) + ":");
            for (int column = 0; column < tables[row].length; column++) {
                System.out.println("[" + tables[row][column] + "]");
            }
            System.out.println();
        }
        System.out.println("\n0 = Available");
        System.out.println("\n1 = Taken");
    }

    private static void allocateSeat() {
        System.out.println("\n----- Allocate Seat ----");

        viewTables();

        System.out.println("Enter table num: ");
        int table = scan.nextInt();

        System.out.println("enter seat num: ");
        int seat = scan.nextInt();
        scan.nextLine();

        if (tables[table - 1][seat - 1] == 0) {
            tables[table - 1][seat - 1] = 1;
            System.out.println("Seat is urs bud :D");
        } else {
            System.out.println("Sorry bud no seat for you :P");
        }
    }

    private static void deallocateSeat() {
        System.out.println("\n----- Deallocate Seat ----");

        viewTables();

        System.out.println("Enter table num: ");
        int table = scan.nextInt();

        System.out.println("enter seat num: ");
        int seat = scan.nextInt();
        scan.nextLine();

        if (tables[table - 1][seat - 1] == 1) {
            tables[table - 1][seat - 1] = 0;
            System.out.println("Seat is not urs anymore bud :D");
        } else {
            System.out.println("YOU WILL STAY 0-0");
        }
    }
}
