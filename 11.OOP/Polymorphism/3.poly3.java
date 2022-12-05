package Polymorphism;

public class Shape {
    
    double area(){
    
        return 0;
        
    }
    
}

class Rectangle extends Shape{

    double base, weight;
    
    Rectangle(double base, double weight){
    
        this.base = base;
        this.weight = weight;
    
    }
    
    @Override
    double area(){
    
        return base*weight;
    
    }

}

class Triangle extends Shape{

    double base, height;
    
    Triangle(double base, double height){
    
        this.base = base;
        this.height = height;
    
    }
    
    @Override
    double area(){
    
        return 0.5*base*height;
    
    }

}

class Test{

    public static void main(String[] args) {
       
        Shape [] s = new Shape[3];
        
        s[0] = new Shape();
        s[1] = new Rectangle(12,232);
        s[2] = new Triangle(12,232);
        
        for (int i = 0; i < 3; i++) {
            
            
        System.out.println(s[i].area());
            
        }
        
        
    }

}
