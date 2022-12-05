package oop;
public class InheriSuperClass15 {
    int x =10;
    
    void display(){
    
        System.out.println("Inside first class");
    
    }
}

class person5 extends InheriSuperClass15{

    int x = 20;
    
    @Override
    void display(){
        super.display();
        System.out.println(super.x);
        
        System.out.println("Without superr keyword, overridden..");
        
        System.out.println(x);
        System.out.println("Inside 2nd class");
    
    }

}

class Super{

    public static void main(String[] args) {
       
        person5 obj = new person5();
        obj.display();
        
    }

}

