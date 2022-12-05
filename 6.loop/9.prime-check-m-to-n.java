
package javaapplication1;

import java.util.Scanner;

public class Prime25Checks {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
      
        int m,n,count=0,totalPrimeNumber=0;
        
        System.out.print("Enter initial Number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number: ");
        n = input.nextInt();
        
        if(m>=2){
            
            for (int i = m; i <=n; i++) {

                for (int j = 2; j <i; j++) {

                    if(i%j==0){
                        count++;
                        break;
                    }

                }
                if(count==0){
                    System.out.println(i);
                    totalPrimeNumber++;
                }
                count=0;

            }
        
        }else{
            System.out.println("0 and 1 is not a prime");
        }
        
        System.out.println("There is a total prime number = "+totalPrimeNumber);
        
    }
}
