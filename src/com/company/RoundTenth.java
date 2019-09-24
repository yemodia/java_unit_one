package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        Scanner tenth = new Scanner(System.in);
        System.out.print("Decimal number?");
        double posNumber = tenth.nextDouble();
        double rounding = (posNumber * 10) +0.5 ;
        double rounded = rounding / 10;
        System.out.print(posNumber+ " rounded to the nearest tenth is " + rounded);

    }
}
