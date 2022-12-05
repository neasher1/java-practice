
package String;

public class StringBuffer5 {
    public static void main(String[] args) {
       
        StringBuffer sb = new StringBuffer("Neasher");
        System.out.println(sb);
        
        sb.append(" Ahmed ");
        sb.append(26);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(0, 4);
        System.out.println(sb);
        
        sb.setLength(6);
        System.out.println(sb);
        
        
        
    }
}
