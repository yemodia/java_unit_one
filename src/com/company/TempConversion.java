package com.company;

public class TempConversion {
    public static void main(String[] args){
        double fahrenheit = 96 ;
        double celsius = (fahrenheit - 32) * (5.0/9);

        System.out.print(fahrenheit + " degrees fahrenheit" + " = " +  celsius + " degrees celsius");
    }
}
