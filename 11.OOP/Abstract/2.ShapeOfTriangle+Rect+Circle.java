
package Abstract;

public abstract class Shape{

    double dim1, dim2;
    
    Shape(double dim1, double dim2){
    
        this.dim1=dim1;
        this.dim2=dim2;
        
    }
    
    abstract void area();

}

class Rectangle extends Shape{

    Rectangle(double dim1, double dim2){
    
        super(dim1,dim2);
        
    }
    
    @Override
    void area(){
    
        double result = dim1*dim2;
        System.out.println("Rectangle Area = "+result);
    
    }

}

class Triangle extends Shape{

    Triangle(double dim1, double dim2){
    
        super(dim1,dim2);
        
    }
    
    @Override
    void area(){
    
        double result = 0.5*dim1*dim2;
        System.out.println("Rectangle Area = "+result);
    
    }

}

class Circle extends Shape{

    Circle(double r){
    
        super(r,r);
        
    }
    
    @Override
    void area(){
    
        double result = Math.PI*dim1*dim2;
        System.out.println("Rectangle Area = "+result);
    
    }

}

class TestProblem{

    public static void main(String[] args) {
       
        Shape obj;
        obj = new Rectangle(12,12);
        obj.area();
        
        obj = new Triangle(12,12);
        obj.area();
        
        obj = new Circle(12);
        obj.area();
        
    }

}
