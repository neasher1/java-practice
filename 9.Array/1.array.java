
package array;

public class Array1 {
    public static void main(String[] args) {
       
        int[] num; //Array Declaration
        num = new int[5]; //Array Creation
        
        num[0] = 1; //initialization
        
        System.out.println(num[0]);
        
        int[] num1 = new int[5]; //Declared + created
        
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        num1[3] = 40;
        num1[4] = 50;
        
        int sum = num1[0] + num1[1] + num1[2] + num1[3] + num1[4];
        System.out.println("Sum = "+sum);
        
        int size = num1.length;
        System.out.println("Size of Array = "+size);
        
    }
}
