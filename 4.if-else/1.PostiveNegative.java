package javaapplication1;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        double num;
        System.out.print("Enter any number: ");
        num = input.nextDouble();
        
        if(0<num){
            System.out.println("Number is positive");
        }
        else if(0>num){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is equal to zero");
        }
    
    }
}
