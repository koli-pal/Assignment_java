package assignment;

import java.util.Scanner;

/*Write a Java program that takes three numbers from the user
and prints the greatest number.*/
public class Two {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Take 1st number:");
        double num1 = input.nextDouble();
        System.out.println("Take 2nd number:");
        double num2 = input.nextDouble();
        System.out.println("Take 3rd number:");
        double num3 = input.nextDouble();
        if (num1>num2 && num1>num2){
            System.out.println("The greatest number is "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The greatest number is "+num2);
        }
        else {
            System.out.println("The greatest number is "+num3);
        }

    }
}
