
package javaapplication1;
import java.util.Scanner;

public class LeapYear1toEnd14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int endyear;
        
        System.out.print("Enter ending year: ");
        endyear = input.nextInt();
        
        for(int i=1; i<=endyear; i++){
            
            if( (i%400==0) || (i%4==0 && i%100!=0) ){
            System.out.printf("%d\t",i);
        }
            
        }
        
        
        

    }
}
