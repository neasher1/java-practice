
package String;

public class String3 {
    public static void main(String[] args) {
       
        String country = "   Bangladesh is my   contry   ";
        System.out.println(country);
        
        String s1 = country.trim();
        System.out.println(s1);
        
        char ch = country.charAt(3);
        System.out.println("ch = "+ch);
        
        int value = country.codePointAt(3);
        System.out.println(value);
        
        int pos = country.indexOf("B");
        System.out.println("First postion = "+pos);
        
        int pos1 = country.lastIndexOf("y");
        System.out.println("Last postion = "+pos1);
        
    }
}
