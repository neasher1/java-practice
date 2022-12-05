
package array;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList12 {
    public static void main(String[] args) {
       
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        System.out.println("Size: "+num.size());
        System.out.println();
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3,40);
        num.add(10);
        
        System.out.println("Array List COntains"+num);
        System.out.println("Size: "+num.size());
        System.out.println();
        
        //using fo each loop
        for(int x : num){
        
            System.out.print(" "+x);
        
        }
        System.out.println();
        
        //using iterator class
        Iterator itr = num.iterator();
        
        while(itr.hasNext()){
        
            System.out.print(" "+itr.next());
        
        }
        System.out.println();
        
        num.remove(2);
        System.out.print("After removing index of 2 = "+num);
        System.out.println();
        
        num.removeAll(num);
        System.out.print("After removed all = "+num);
        
        //remove all er moto same kaj
        num.clear();
        System.out.print("After removed all = "+num);
    }
}
