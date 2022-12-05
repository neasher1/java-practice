
package array;

import java.util.ArrayList;

public class ArrayList14 {
    public static void main(String[] args) {
       
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(130);
        number1.add(40);
        System.out.println("Number1 = "+number1);
        
        
        number2.add(20);
        number2.add(30);
        number2.add(40);
        number2.add(80);
        System.out.println("Number2 = "+number2);
        
        number3.addAll(number1);
        System.out.println("Number3 = "+number3);
        
        boolean result = number3.equals(number1);
        System.out.println("number3 == number1 : "+result);
        
        result = number3.equals(number2);
        System.out.println("number3 == number2 : "+result);
        
        
    }
}
