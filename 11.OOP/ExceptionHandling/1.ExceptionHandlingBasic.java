
package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
        int [] a = new int[4];
        a[4] = 10;
        System.out.println(a[4]);
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           System.out.println(e);
           
       }
        
        try{
        String s = "Neasher";
            System.out.println(s.charAt(9));
       
       }catch(Exception e){
           
           System.out.println(e);
           
       }
        
        try{
        String s = null;
            System.out.println(s.charAt(0));
       
       }catch(Exception e){
           
           System.out.println(e);
           
       }
        
       try{
        int num = 10;
        int r = num/0;
        System.out.println(r);
        
        int [] a = new int[4];
        a[4] = 10;
        System.out.println(a[4]);
       
       }catch(ArithmeticException e){
           
           System.out.println(e);
           
       }
       
       finally{
       
           System.out.println("Last line of the programm");
       
       }
        
    }
}
