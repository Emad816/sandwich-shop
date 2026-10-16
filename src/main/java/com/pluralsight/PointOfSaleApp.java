package com.pluralsight;

import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loaded = "";
        String sandwichSize;
        System.out.printf("Enter sandwich size\n" +
                "Regular: base price $5.45 \n" +
                "Large: base price $8.95 \n");
        sandwichSize = scanner.next();
        System.out.printf("Would you like the sandwich loaded (yes/no)");
        double basePrice = 0;
        if(sandwichSize.equals("Regular")){
            basePrice = 5.45;
            if(loaded.equals("yes")){
                basePrice += 1;
            }
        }else {
            basePrice = 8.95;
            if(loaded.equals("yes")){
                basePrice += 1.75;
            }
        }

        double discount = 0 ;
        int userAge = 0;
        System.out.printf("Enter your age ");
        userAge = scanner.nextInt();
        if(userAge <= 17){
            discount = basePrice * 0.10 ;
        } else if (userAge >= 65) {
            discount = basePrice * 0.20;
        }else {
            discount = 0;
        }

        double sandwichPrice = 0;
        sandwichPrice = basePrice - discount;
        System.out.printf("Sandwich price %.2f ",sandwichPrice);




    }
}
