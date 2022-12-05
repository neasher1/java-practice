
package javaapplication1;
import java.util.Scanner;

public class CircleArea5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radius, area;
        
        System.out.println("Area Of circle-");
        System.out.print("Enter Radius = ");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius;
        System.out.println("Area of Circle = "+area);
        System.out.println("");
        
        System.out.println("Area of Rectangle- ");
        
        double base,height,area1;
        
        System.out.print("Enter Base = ");
        base = input.nextDouble();
        
        System.out.print("Enter Height = ");
        height = input.nextDouble();
        
        area1 = base * height;
        System.out.println("Area of Reactangle = "+area1);
        
    }
}
