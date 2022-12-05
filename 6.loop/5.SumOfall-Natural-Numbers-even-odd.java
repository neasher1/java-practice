
package javaapplication1;

import java.util.Scanner;


public class SumOfNaturalNumbers21 {
    public static void main(String[] args) {
         /*
            *
            *sum of all numbers 1 to 10
            *
        */   
         
        int sum=0;
        for (int i = 1; i <=10; i++) {
            
            sum = sum+i;
            System.out.print(" "+i);
            
        }
        System.out.println("");
        System.out.println("The Sum =  "+sum);
        System.out.println("");
        
        
         /*
            *
            *Sum of odd numbers 1 to 10
            *
        */
         
        int sum1=0;
        for (int i = 1; i <=10; i=i+2) {
            sum1 = sum1+i;
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("The sum of Odd = "+sum1);
        System.out.println("");
        
        
        /*
            *
            *Sum of all the numbers m to n
            *
        */
        
        int sum2=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number = ");
        int num1 = input.nextInt();
        
        System.out.print("Enter final nUmber = ");
        int num2 = input.nextInt();
        
        for (int i = num1; i <=num2; i++) {
            sum2 = sum2+i;
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("Sum = "+sum2);
        System.out.println("");
        
        
        
        /*
            *
            *Sum of all even numbers from m to n
            *
        */
        int sum3=0;
        for (int i = num1; i <=num2; i++) {
            if (i%2==0) {
                sum3 = sum3+i;
                System.out.print(" "+i);
            }
        }
        System.out.println("");
        System.out.println("Sum of Even = "+sum3);
        System.out.println("");
        
        /*
            *
            *Sum of all odd numbers from m to n
            *
        */
        
        int sum4=0;
        for (int i = num1; i <=num2; i++) {
            if (i%2!=0) {
                sum4 = sum4+i;
                System.out.print(" "+i);
            }
        }
        System.out.println("");
        System.out.println("Sum of Odd = "+sum4);
        
        
    }
}
