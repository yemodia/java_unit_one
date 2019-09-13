package com.company;

public class Painting {
    public static void main(String[] args){
         int lengthRoom = 32;
         int widthRoom = 40;
         int heightRoom = 16;
         int areaWindow = 15;
         int areaDoor = 20;
         final int gallonPaint = 350; //sq ft

         double areaRoom =  (lengthRoom * widthRoom) + 2 * (lengthRoom * heightRoom) + 2 * (widthRoom * heightRoom -2 *
                 (areaWindow) -4 * (areaDoor) );
         double amountOfPaint = areaRoom / gallonPaint;
         System.out.print("You will need "  +amountOfPaint);
         System.out.print(" gallons of paint");

    }
}
