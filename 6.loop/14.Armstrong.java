
package javaapplication1;

import java.util.Scanner;

public class Armstrong30 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int sum=0,rem,temp,num;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        
        temp = num;
        
        while(temp!=0){
        
            rem = temp % 10;
            sum = sum + rem*rem*rem;
            temp = temp / 10;
        
        }
        if(num==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
        
    }
}
