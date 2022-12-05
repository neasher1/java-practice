
package javaapplication1;

import java.util.Scanner;

public class SumofDigits27 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any numbers = ");
        int num = input.nextInt();
        
        int temp = num;
        int rem,sum=0;
        
        while(temp!=0){
        
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        
        }
        System.out.println("Sum = "+sum);
        
    }
}
