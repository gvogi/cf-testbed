package gr.aueb.gr.ch2;


import java.util.Scanner;

/**
 * Converts 3 int inputs to a DD/MM/YY format
 * */

public class DateFormatDemo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.println("What day it is:");
        day = sc.nextInt();

        System.out.println("What month it is:");
        month = sc.nextInt();

        System.out.println("What year it is:");
        year = sc.nextInt();

        System.out.printf("Date is: %02d/%02d/%d", day, month, year);

}

}
