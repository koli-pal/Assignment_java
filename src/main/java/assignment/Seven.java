//Write a method to find the maximum of three numbers.

package assignment;

import java.util.Scanner;

public class Seven {
    static void myMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = input.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3 = input.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Maximum number is "+" "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Maximum number is "+ " "+ num2);

        }else {
            System.out.println("Maximum number is "+" "+ num3);
        }
    }
    public static void main(String[]args){
        myMethod();
    }
}
