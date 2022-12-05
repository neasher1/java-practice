package javaapplication1;
import java.util.Scanner;

public class TernaryOp16 {
    public static void main(String[] args) {
       
       
        Scanner input = new Scanner(System.in);
        
        int num1,num2,large;
        System.out.print("Enter 2 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1>num2) ? num1:num2; // 1st condition jodi true hy taile num1 kaj korbe, jodi false hy num2
        
        System.out.println(large+" is large number");
       
    }
}
