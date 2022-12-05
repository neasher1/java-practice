
package String;

public class String1 {
    public static void main(String[] args) {
       
        String s1 = "Neasher Ahmed";
        String s2 = new String("neasher Ahmed");
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        boolean b = s1.contains(s2);
        System.out.println("Conatins = "+b);
        
        boolean empty = s1.isEmpty();
        System.out.println("Is empty = "+empty);
        
        int len = s1.length();
        System.out.println("Length = "+len);
        
        if(s1.equals(s2)){
        
            System.out.println("s1 == s2 ");
        
        }else{
            System.out.println("Not equals");
        }
        
        if(s1.equalsIgnoreCase(s2)){
        
            System.out.println("s1 == s2, they are equals ");
        
        }else{
            System.out.println("Not equals");
        }
        
        if(s1.contains(s2)){
        
            System.out.println("s1 == s2, they are equals ");
        
        }else{
            System.out.println("Not equals");
        }
        
    }
}
