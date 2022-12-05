
package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort_15 {
    public static void main(String[] args) {
       
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(10);
        number.add(-100);
        number.add(1510);
        number.add(10);
        number.add(1);
        number.add(7);
        number.add(90);
        
        System.out.println("Before Sorting = "+number);
        
        Collections.sort(number);
        System.out.println("After SOrting in Ascending = "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending sorted = "+number);
        
    }
}
