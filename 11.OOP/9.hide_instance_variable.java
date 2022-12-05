
package oop;

public class Hide_Instance_Variable7 {
    
    double height, width, length;
    
    Hide_Instance_Variable7(double height, double width, double length){
    
        this.height = height;
        this.width = width;
        this.length = length;
    
    }
    
    double display(){
    
       return height * width * length; 
    
    }
    
}

class test1{

    public static void main(String[] args) {
        
        Hide_Instance_Variable7 obj =  new Hide_Instance_Variable7(10,10,20);
        Hide_Instance_Variable7 obj1 =  new Hide_Instance_Variable7(20,50,90);
        
        System.out.println("Volume for box1 = "+obj.display());
        System.out.println("Volume for box2 = "+obj1.display());
        
    }

}
