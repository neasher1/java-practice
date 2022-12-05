
package array;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {
       
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(10);
        number.add(20);
        number.add(2,40);
        number.add(3,50);
        number.add(60);
        
        System.out.println(" "+number);
        System.out.println("Size = "+number.size());
        
        for(int num : number){
        
            System.out.print(" "+num);
        
        }
        System.out.println();
        
//        number.clear();
//        System.out.println("After cleared all index: "+number);
        
        boolean empty = number.isEmpty();
        System.out.println("Array is Empty: "+empty);
        
        boolean contain = number.contains(20);
        System.out.println("is 30 in the list: "+contain);
        
        int pos = number.indexOf(60);
        System.out.println("Index of 60: "+pos);
        
        number.set(0, 1000);
        System.out.println("After replaced index of 0: "+number);
        
        int num = number.get(0);
        System.out.println("After get index of 0: "+num);
        
        
    }
}
