package assignment;

import java.util.Scanner;

//Write a Java program to get a number from the user
// and print whether it is positive or negative.
public class One {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = input.nextDouble();
        if (number>0){
            System.out.println("Number is positive");
        }
        else if(number<0) {
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is 0");
        }



    }
}
