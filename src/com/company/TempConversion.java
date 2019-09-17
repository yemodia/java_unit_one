package com.company;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a fahrenheit temperature:");
        double fahrenheit = scan.nextInt() ;

        double celsius = (fahrenheit - 32) * (5.0/9);

        System.out.print(fahrenheit + " degrees fahrenheit" + " = " +  celsius + " degrees celsius");
    }
}
