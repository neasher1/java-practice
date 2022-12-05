package javaapplication1;
import java.util.Scanner;

public class SimpleCalculator2 {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        double num1, num2, result;
        System.out.print("Enter 1st number= ");
        num1 = input.nextDouble();
        
        System.out.print("Enter 2nd number= ");
        num2 = input.nextDouble();
        
        result = num1+num2;
        System.out.println("Sum = "+result);
        
        result = num1-num2;
        System.out.println("Sub = "+result);
        
        result = num1*num2;
        System.out.println("Multi = "+result);
        
        result = num1/num2;
        System.out.println("Div = "+result);
        
        result = num1%num2;
        System.out.println("Reminder = "+result);
        
    
    }
    
}
