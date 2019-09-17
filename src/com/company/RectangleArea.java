package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int length = scan.nextInt() ;

        System.out.print("Enter the width: ");
        int width = scan.nextInt() ;

        int area = width * length ;

        System.out.println("Area = " + area);

    }
}
