
package String;

public class StringPalindrome6 {
    public static void main(String[] args) {
       
        String s1 = "Madam";
        System.out.println(s1);
        
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(s1);
        
        String rev = sb.reverse().toString();
        System.out.println(rev);
        System.out.println(sb);
        System.out.println(s1);
        
        if(s1.equalsIgnoreCase(rev)){
        
            System.out.println("Palindrome");
        
        }else{
        
            System.out.println("Not Palindrome");
        
        }
        
        
    }
}
