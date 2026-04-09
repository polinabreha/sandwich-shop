package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {


        //input size
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's size of sandwich would you like (regular or large)? ");
        String sandwichSize = scanner.nextLine();
        double price = 0;

        if (sandwichSize.equalsIgnoreCase("regular")) {
            price = 5.45;
        } else if (sandwichSize.equalsIgnoreCase("large")) {
            price = 8.95;
        }else {
            System.out.println("Invalid sandwich size!");
            return; // exit program if input is invalid
        }


        //input age

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        if (age <= 17) {
            price = (double)price * 0.90;
        } else if (age >= 65) {
             price = price * 0.80;
        }

        System.out.printf("The price of your %s sandwich is $%.2f\n",sandwichSize, price);




        }
    }
