package array;

import java.util.Scanner;

public class Array_SumOf_Diagonal_Upper_lower8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][3];
        int SumOfDiagonal = 0, SumOfUpper = 0, SumOfLower = 0;

        //taking input
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();

            }

        }
        System.out.println();
	
	//Diagonal = row and col er index soman thakbe
	//Upper = row er index col er index er cheye choto; row<col
	//lower = row er index col er cheye boro; row>col
        //Sum of Diagonal Elements, Upper and Lower
        System.out.print("A = ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t" + A[i][j]);

                if (i == j) {

                    SumOfDiagonal = SumOfDiagonal + A[i][j];

                }

                if (i < j) {

                    SumOfUpper = SumOfUpper + A[i][j];

                }

                if (i > j) {

                    SumOfLower = SumOfLower + A[i][j];

                }

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("SumOfDiagonal =  " + SumOfDiagonal);
        System.out.println("SumOfUpper =  " + SumOfUpper);
        System.out.println("SumOfLower =  " + SumOfLower);

    }
}
