
package javaapplication1;

import java.util.Scanner;

public class Series22 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        //1+2+3+...+n
        int sum=0,n;
        System.out.print("Enter last number: ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            
            sum = sum+i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum = "+sum);
        System.out.println();
        
        
        //1+3+5+...+n
        int sum1=0;
        for (int i = 1; i <= n; i++) {
            
            if(i%2!=0){
                sum1 = sum1 + i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Sum = " + sum1);
        System.out.println();
        
        
        //1.5+2.5+3.5+...+n
        double sum2=0;
        for (double i = 1.5; i <= n; i++) {
            
                sum2 = sum2 + i;
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum = " + sum2);
        System.out.println();
        
        
        //1^2+2^2+3^2+...+n^2
        int sum3=0;
        for (int i = 1; i <= n; i++) {
                sum3 = sum3 + i * i;
                System.out.print(i +"X"+i+" ");
        }
        System.out.println();
        System.out.println("Sum = " + sum3);
        System.out.println();
        
        //1*2*3*4*....*n
        int result=1;
        for (int i = 1; i <=n; i++) {
            result = result * i;
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Result = "+result);
        
    }
}
