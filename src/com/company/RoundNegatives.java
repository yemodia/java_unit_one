package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args){
        Scanner neg = new Scanner(System.in);
        System.out.print("Enter a negative value:");
        double negativeNumOne =   neg.nextDouble();
        int casting = (int)(negativeNumOne - 0.5) ;
        System.out.print(negativeNumOne + " rounded to a whole number is" + casting);

    }
}
