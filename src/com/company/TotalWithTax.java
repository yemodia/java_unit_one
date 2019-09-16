package com.company;

public class TotalWithTax {
    public static void main(String[] args) {
        final double TAXRATE = 0.0825;
        double itemPrice = 52.75;
        double salesTax = itemPrice * TAXRATE;
        double totalCost = itemPrice + salesTax;
        System.out.println( "Price: " + itemPrice);
        System.out.println("Sales Tax: " + salesTax);
        System.out.print("Total: " + "$" + totalCost);
    }
}
