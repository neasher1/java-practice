package javaapplication1;
import java.util.Scanner;

public class EvenOdd10 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
}
