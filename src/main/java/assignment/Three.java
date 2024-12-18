package assignment;

import java.util.Scanner;

//Write a Java program that takes a year from the user
// and prints whether it is a leap year or not.
public class Three {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }

    }
}
