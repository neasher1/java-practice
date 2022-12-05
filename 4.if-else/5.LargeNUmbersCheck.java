
package javaapplication1;
import java.util.Scanner;

public class LargeNumberChecks12 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int num1,num2,num3;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter 3rd number: ");
        num3 = input.nextInt();
        
        if(num1>num2 && num1>num3){
            System.out.printf("%d is Large",num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.printf("%d is Large",num2);
        }
        else if(num3>num1 && num3>num2){
            System.out.printf("%d is Large",num3);
        }
        else{
            System.out.println("ALl is equal");
        }
        
        System.out.println("");
        
    }
}
