
package javaapplication1;

import java.util.Scanner;

public class MultiplicationTable23 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initail number = ");
        int initialnum = input.nextInt();
        
        System.out.print("Enter Final Number = ");
        int finalnum = input.nextInt();
        
        for(int i=initialnum; i<=finalnum; i++){
            
            for (int j = 1; j <=10; j++) {
                System.out.println(i+"X"+j+" = "+i*j);
            }
            System.out.println();
        
        }
        
        
    }
}
