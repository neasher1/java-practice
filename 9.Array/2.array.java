
package array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double[] num = new double[5];
        double sum=0;
        
        System.out.print("Enter 5 numbers: ");
        
        for (int i = 0; i < num.length; i++) {
            
            num[i] = input.nextDouble();
            
        }
        
        for (int i = 0; i < num.length; i++) {
            
            sum = sum + num[i];
            
        }
        
        double avg = sum/num.length;
        
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        
        
    }
}
