
//Write a method to check if a number is even or odd.

package assignment;
import java.util.Scanner;

public class Five {
    static void myMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
    public static void main(String[]args){
        myMethod();
    }
}
