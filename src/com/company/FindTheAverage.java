package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[] args){
        Scanner average = new Scanner(System.in);
        double TotalAverage = 0;

        System.out.print("Enter the first value: ");
        double ValueOne = average.nextDouble();
        TotalAverage += ValueOne;

        System.out.print("Enter the second value: ");
        double ValueTwo = average.nextDouble();
        TotalAverage += ValueTwo;

        System.out.print("Enter the third value: ");
        double ValueThree = average.nextDouble();
        TotalAverage += ValueThree;

        System.out.print("Enter the fourth value: ");
        double ValueFour = average.nextDouble();
        TotalAverage += ValueFour;

        TotalAverage /= 4;

        System.out.print("The average of the numbers entered is: " + TotalAverage);

    }

}
