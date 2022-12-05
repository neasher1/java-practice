
package Polymorphism;

public class MethodOverload {
    
    void add(){
    
        System.out.println("Nothing");
        
    }
    
    void add(int a, int b){
    
        System.out.println(a+b);
        
    }
    
    void add(double a,double b){
    
        System.out.println(a+b);
        
    }
    
    void add(int a, int b, int c){
    
        System.out.println(a+b+c);
        
    }
    
}

class main{

    public static void main(String[] args) {
       
        MethodOverload obj = new MethodOverload();
        obj.add(5,10,5);
        obj.add();
        obj.add(5.5,5.5);
        obj.add(5,5);
        
    }

}
