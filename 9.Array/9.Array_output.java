
package array;
/*
0 1 2 3 4
5 6 7 8 9
10 11 12 13 14
15 16 17 18 19
20 21 22 23 24 
25 26 27 28 29
*/
public class Array_output9 {
    public static void main(String[] args) {
       
        int[][] num = new int[6][5];
        int k=0;
        
        //Assign the value
        for (int i = 0; i <6; i++) {
            
            for (int j = 0; j <5; j++) {
                
                num[i][j] = k;
                k++;
                
            }
            
        }
        
        //printing
        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print(" "+num[i][j]);
                
            }
            System.out.println();
            
        }
        
    }
}
