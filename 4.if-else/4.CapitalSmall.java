package javaapplication1;
import java.util.Scanner;

public class VowelConsonant11 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Enter any Character: ");
        ch = input.next().charAt(0);
        
        if(ch>='A' && ch<='Z'){
           
            System.out.println("Cpaital");
            
        }
        
        else if(ch>='a' && ch<='z'){
            System.out.println("Small");
        }
        
        else{
            System.out.println("Not a letter");
        }
        
    }
}
