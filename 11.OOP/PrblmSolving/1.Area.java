
package PrblmSolving;

import java.util.Scanner;

public class Area {
    double length;
    double breadth;
    
    void setDim(double a, double b){
    
        length = a;
        breadth = b;
    
    }
    
    double getArea(){
        
        return length * breadth;
    
    }
    
}

class main{

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        Area obj = new Area();
        
        System.out.print("Enter Length: ");
        double length = input.nextDouble();
        
        System.out.print("Enter depth: ");
        double breadth = input.nextDouble();
        
        obj.setDim(length,breadth);
        
        System.out.println("Area Of Rectangle = "+obj.getArea()+"\n");
        
    }
    
}
