package oop;

import java.util.Scanner;

public class FactRecursion10 {
    
   int fact(int num){
   
       if(num==1)
           return 1;
       else
           return num*fact(num-1);
   
   }
    
}

class fact{

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        FactRecursion10 obj = new FactRecursion10();
        int result = obj.fact(5);
        System.out.println("Factorial of 5 = "+result);
        
        
        int result1 = obj.fact(4);
        System.out.println("Factorial of 4 = "+result1);
        
        System.out.println("Enter nmumber");
        int num = input.nextInt();
        int result2 = obj.fact(num);
        System.out.println("Factorial = "+result2);
        
        
    }

}
