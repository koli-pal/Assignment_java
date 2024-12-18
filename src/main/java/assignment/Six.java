//Write a method to calculate the sum/sub/mul/div  of two numbers.

package assignment;

import java.util.Scanner;

public class Six {
    static void myMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        int sub = num1- num2;
        int multiplication = num1*num2;
        float division = (float) (num1/num2);
        System.out.println("sum="+sum +" ,"+"sub="+sub +" ,"+"multiplication="+ multiplication+" ,"+"division="+division);
    }
    public static void main(String[]args){
    myMethod();
    }
}
