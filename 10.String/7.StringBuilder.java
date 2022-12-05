
package String;

public class StringBuilder7 {
    public static void main(String[] args) {
       
        StringBuilder str = new StringBuilder("Neasher");
        
        str.append(" Ahmed ");
        str.append(25);
        System.out.println(str);
        
        str.reverse();
        System.out.println(str);
        
        str.delete(0, 5);
        System.out.println(str);
        
    }
}
