
package String;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
       
        Random rand = new Random();
        
        int reandomNumber = rand.nextInt(5); //0 theke 4 porjonto
        System.out.println("Generator = "+reandomNumber);
        
        int generate = (int) (Math.random()*10)+1; //1 theke 10 porjonto
        System.out.println("Generator with Math method = "+generate);
        
    }
}
