package com.company;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a weight in pounds: ");
        int lbs = scan.nextInt();
        double kilo = lbs/2.205;

        System.out.print(lbs + " pounds" + " = " + kilo + " kilograms" );

    }
}
