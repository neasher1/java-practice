
package javaapplication1;
import java.util.Scanner;

public class CelsTemp6 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double farn,cels;
        
        System.out.println("Celsious To Farenheit - ");
        System.out.print("Enter Celsious Temp = ");
        cels = input.nextDouble();
        
        farn = 1.8 * cels + 32;
        System.out.println("Farenheit Temp = "+farn);
        System.out.println("");
        
        System.out.println("Farheit To Celsious - ");
        
        System.out.print("Enter Farnheit Temp: ");
        farn = input.nextDouble();
        
        cels = 0.5 * (farn - 32);
        System.out.println("Celsious Temp = "+cels);
        
    }
    
}
