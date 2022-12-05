package javaapplication1;

import java.util.Scanner;


public class Factorial23 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int num, fact=1;
        System.out.print("Enter any poitive number = ");
        num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Factorial of "+num+" = "+fact);
        
    }
}
