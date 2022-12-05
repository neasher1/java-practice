
package javaapplication1;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers you want = ");
        int num = input.nextInt();
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print(" "+row);
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        for (int row = num; row >=1; row--) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print(" "+row);
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print(" "+row%2);
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print(" "+col%2);
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print((char)(col+64)+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=row; col++) {
                
                System.out.print((char)(col+96)+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=num-row; col++) {
                
                System.out.print(" ");
                
            }
            for (int col = 1; col <=row; col++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
        System.out.println();
        
        
        for (int row = num; row >=1; row--) {
            
            for (int col = 1; col <=num-row; col++) {
                
                System.out.print(" ");
                
            }
            for (int col = 1; col <=row; col++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
        System.out.println();
        
        
        for (int row = 1; row <=num; row++) {
            
            for (int col = 1; col <=num-row; col++) {
                
                System.out.print(" ");
                
            }
            for (int col = 1; col <=2*row-1; col++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
        System.out.println();
        
        for (int row = num; row >=1; row--) {
            
            for (int col = 1; col <=num-row; col++) {
                
                System.out.print(" ");
                
            }
            for (int col = 1; col <=2*row-1; col++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
        System.out.println();
        
        
    }
}
