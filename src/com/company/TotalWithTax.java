package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double TAXRATE = 0.0825;
        System.out.print("What is the price of your item?");
        double itemPrice = scan.nextDouble();
        double salesTax = itemPrice * TAXRATE;
        double totalCost = itemPrice + salesTax;
        System.out.println( "Price: " + itemPrice);
        System.out.println("Sales Tax: " + salesTax);
        System.out.print("Total: " + "$" + totalCost);
    }
}
