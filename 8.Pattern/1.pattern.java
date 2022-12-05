
package javaapplication1;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers you want = ");
        int num = input.nextInt();
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print(" "+col);
                
            }
            System.out.println();
            
        }
        
    }
}
