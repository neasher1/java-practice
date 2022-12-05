
package String;

public class String2 {
    public static void main(String[] args) {
       
        String[] names = {"Neasher","Ahmed","Hridoy","Maruf"};
        String firstName = "Neasher";
        String lastName = " Ahmed";
        
        for(String x : names){
        
            System.out.print(x+" ");
        
        }System.out.println();
        
        String fullName = firstName + lastName;
        System.out.println(fullName);
        
        String fullName1 = firstName.concat(lastName);
        System.out.println(fullName1);
        
        String upper = fullName.toUpperCase();
        System.out.println(upper);
        
        String lower = fullName.toLowerCase();
        System.out.println(lower);
        
        boolean start = firstName.startsWith("N");
        System.out.println("startsWith = "+start);
        
        boolean end = lastName.endsWith("ed");
        System.out.println("Ending = "+end);
        
    }
}
