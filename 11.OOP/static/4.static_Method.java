
package Static;

public class StaticMethod4 {
    
    void display(){
    
        System.out.println("Non Static Method");
    
    }
    
    static void display1(){
    
        System.out.println("Static Method");
    
    }
    
}

class main3{

    public static void main(String[] args) {
       
        StaticMethod4 obj = new StaticMethod4();
        obj.display();
        
        StaticMethod4.display1();
        
    }

}
