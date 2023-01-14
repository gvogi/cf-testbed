package gr.aueb.gr.ch2;

import java.util.Scanner;

/**
 * Raw Fahrenheit to Celsius Converter
 * */

public class FahrenheitToCelsiusDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fahrenheit;
        int result;

        System.out.println("Give a temperature in fahrenheit:");

        fahrenheit = sc.nextInt();

        result = (5 * (fahrenheit - 32) / 9);

        System.out.printf("Temperature of %d degrees fahrenheit equals to:%n%d degrees Celsius",fahrenheit ,result);

    }

}
