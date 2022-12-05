package javaapplication1;

import java.util.Scanner;

public class ArmstroonMtoN31 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int sum=0,rem,temp,num1,num2;
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter final number: ");
        num2 = input.nextInt();
        
        
        for (int i = num1; i <=num2; i++) {
            temp = i;
            sum = 0;
            
            while(temp!=0){

                rem = temp % 10;
                sum = sum + rem*rem*rem;
                temp = temp / 10;

            }
            
            
            if(i==sum){
                System.out.print(i+" ");
            }
            
        }
        
    }
}
