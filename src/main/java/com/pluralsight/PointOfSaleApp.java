package com.pluralsight;

import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sandwichSize;
        System.out.printf("Enter sandwich size\n" +
                "Regular: base price $5.45 \n" +
                "Large: base price $8.95 \n");
        sandwichSize = scanner.next();
        double basePrice = 0;
        if(sandwichSize.equals("Regular")){
            basePrice = 5.45;
        }else {
            basePrice = 8.95;
        }

        double sandwichPrice = 0;
        int userAge = 0;

        System.out.printf("Enter your age ");
        userAge = scanner.nextInt();
        if(userAge <= 17){
            basePrice= basePrice - (basePrice * 0.10);
        } else if (userAge >= 65) {
            basePrice=basePrice - (basePrice * 0.20);
        }else {
            basePrice = basePrice;
        }
        sandwichPrice = basePrice;
        System.out.printf("Sandwich price %.2f ",sandwichPrice);




    }
}
