
package oop;

public class CallByReference9 {
    
        String name;
        
        void change(CallByReference9 obj1){
        
            obj1.name = "Neasher";
        
        }
        
}

class main4{

    public static void main(String[] args) {
      
        CallByReference9 obj = new CallByReference9();
        
        obj.name = "Hridoy";
        System.out.println("Before calling : "+obj.name);
        
        obj.change(obj);
        System.out.println("After Calling: "+obj.name);
        
        
    }

}
