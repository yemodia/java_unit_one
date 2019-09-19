package com.company;

import java.util.Scanner;

public class AddOneTakeOne {
    public static void main(String[] args){
        Scanner alpha = new Scanner(System.in);

        System.out.print("Please enter a single digit value: ");
        int number = alpha.nextInt();
        int finalNumber = number;
        int numberMinusOne = number-- ;
        int numberPlusOne = finalNumber++ ;
        System.out.print(number + " ");
        System.out.print(numberMinusOne + " ");
        System.out.print(finalNumber);
    }
}
