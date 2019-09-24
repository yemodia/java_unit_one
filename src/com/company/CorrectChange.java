// Yerim Dia
// AP Computer Science
// September 23, 2019
// This code finds the exact change in American Dollars of any value entered in cents.


package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[]args){
        Scanner money = new Scanner(System.in);
        int dollar = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        System.out.print("Please enter a whole number of cents:");
       int userTotal = money.nextInt();
       int dollarTotal = userTotal / dollar;
       int userDollar = userTotal % 100;
       int quarterTotal = userDollar / quarter; // the amounts of quarters needed
       int quarterRemainder = userDollar % 25; // stores the remainder of the number once no more quarters are needed
       int dimeTotal = quarterRemainder / dime;
       int dimeRemainder = quarterRemainder % 10;
       int nickelTotal = dimeRemainder / nickel;
       int nickelRemainder = dimeRemainder % 5;
       int pennyTotal = nickelRemainder / penny;

       System.out.print("You change is " + dollarTotal + " dollars " + quarterTotal + " quarters ");
       System.out.print(dimeTotal+ " dimes " + nickelTotal + " nickels "+ pennyTotal + " pennies" );





    }
}
