
package javaapplication1;

public class IncreDecre {
    public static void main(String[] args) {
       
        int x=10, y;
        
        y = x++; //x=10
        System.out.println("Y = "+y);
        
        y = x; //x=11
        System.out.println("Y = "+y);
        
        y = ++x; //x=12
        System.out.println("Y = "+y);
        
        y = x++; //x=12
        System.out.println("Y = "+y);
        
        y = x; //x=13
        System.out.println("Y = "+y);
        
        y = --x; //x=12
        System.out.println("Y = "+y);
        
        y = x--; //x=12
        System.out.println("Y = "+y);
        
        y = x; //x=11
        System.out.println("Y = "+y);
        
    }
}
