
package String;

public class WrapperClass8 {
    public static void main(String[] args) {
       
        //Autoboxing : primitive data type --> Obejct
        
        int a = 10;
        
        //Integer obj = Integer.valueOf(a);
        
        Integer obj = a; //Integer.valueOf(a) compilder auto ei method dhore nibe
        
        System.out.println("Primitive to obj = "+obj);
       
        
        
        //Unboxing : Object ---> Primitive
        
        Double obj1 = new Double(10.24);
        
        double primitive = obj1; //obj1.doubleValue() compiler auto ei method dhorbe
        
        //double primitive = obj1.doubleValue();
        
        System.out.println("Obj to Primi: "+primitive);

        
    }
}
