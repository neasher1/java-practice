
package javaapplication1;
import java.util.Scanner;

public class PalindromCheckMtoN {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number = ");
        int num1 = input.nextInt();
        
        System.out.print("Enter Final Number = ");
        int num2 = input.nextInt();
        
        int temp,rem,sum=0;
        
        for (int i = num1; i <=num2; i++) {
            
            temp = i;
            sum = 0;
            
            while(temp!=0){
                
                rem = temp % 10;
                sum = (sum*10) + rem;
                temp = temp / 10;
            
            }
            
            if(i==sum){
                System.out.println(i);
            }
            
            
        }
        
        
    }
}
