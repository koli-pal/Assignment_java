package assignment;
//Display Sum of n Natural Numbers

import java.util.Scanner;

public class Four {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        int num =input.nextInt();
        int sum =0;
        for (int i=1;i<=num;i++){
            sum +=i ;
        }
        System.out.println("Sum of the natural numbers are" +' ' +sum);
    }
}
