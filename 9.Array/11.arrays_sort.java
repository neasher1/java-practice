
package array;

import java.util.Arrays;

public class Array_Sort11 {
    public static void main(String[] args) {
       
        int[] num = {1,23,2,333,34,-5,6,7};
        
        Arrays.sort(num);
        
        System.out.print("Ascending: ");
        for (int i = 0; i < 8; i++) {
            
            System.out.print(" "+num[i]);
            
        }
        System.out.println();
        
        System.out.print("Descending: ");
        for (int i = 7; i >=0; i--) {
            
            System.out.print(" "+num[i]);
            
        }
        System.out.println();
        
    }
}
