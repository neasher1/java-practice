
package String;

public class String_to_Primitive_Reverse {
    public static void main(String[] args) {
       
        //String to primitive
        String str = "1010";
        
        int i = Integer.parseInt(str);
        System.out.println(i);
        
        double d = Double.parseDouble(str);
        System.out.println(d);
        
        float f = Float.valueOf(str);
        System.out.println(f);
        
        
        //primitive to String
        int a =50;
        
        String s = Integer.toString(a);
        System.out.println(s);
        
        String s1 = Double.toString(a);
        System.out.println(s1);
        
    }
}
