
package javaapplication1;

import java.util.Scanner;

public class Palindrome29 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int sum=0,rem,temp,num;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        
        temp = num;
        
        while(temp!=0){
        
            rem = temp % 10;
            sum = sum*10 + rem;
            temp = temp / 10;
        
        }
        if(num==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
    }
}
