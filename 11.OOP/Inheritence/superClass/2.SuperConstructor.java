package oop;

public class InheriSuperConstructor16 {
    
    InheriSuperConstructor16(){
    
        System.out.println("Inside first COnstructor");
    
    }
    
}
class B extends InheriSuperConstructor16{

    B(){
        super();
        System.out.println("Inside 2nd COnstructor");
    
    }

}

class SuperCons{

    public static void main(String[] args) {
       
        B obj = new B();
        
        
    }


}
