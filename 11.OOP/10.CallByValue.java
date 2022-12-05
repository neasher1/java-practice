
package oop;

public class CallByValue8 {
    
    void change(int a){
    
        a = 20;
    
    }
    
}

class main3{

    public static void main(String[] args) {
       
        CallByValue8 obj = new CallByValue8();
        
        int x = 10;
        System.out.println("Before Calling od X : "+x);
        
        obj.change(x);
        System.out.println("After calling of X : "+x);
        
    }

}
