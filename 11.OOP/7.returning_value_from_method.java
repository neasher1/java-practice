
package oop;

public class Return_Value_Method6 {
    
    int square(int value){
    
        return value * value;
    
    }
    
}

class test{

    public static void main(String[] args) {
       
        Return_Value_Method6 obj = new Return_Value_Method6();
        int result = obj.square(5);
        System.out.println("Square of 5 = "+result);
       
        Return_Value_Method6 obj1 = new Return_Value_Method6();
        System.out.println("Square of 6 = "+obj1.square(6));
    }

}
