package array;

import java.util.Scanner;

public class ArrayMatrix7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] sum = new int[2][3];

        //taking input A matirx
        System.out.println("Enter elements for A matrix: ");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();

            }

        }
        System.out.println();

        //taking input B matirx
        System.out.println("Enter elements for B matrix: ");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = input.nextInt();

            }

        }
        System.out.println();

        //printing A matrix
        System.out.print("A = ");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t" + A[i][j]);

            }
            System.out.println();

        }
        System.out.println();

        //printing B matrix
        System.out.print("B = ");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t" + B[i][j]);

            }
            System.out.println();

        }
        System.out.println();

        //printing A+B matrix
        System.out.print("A+B = ");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                sum[i][j] = A[i][j] + B[i][j];
                System.out.print("\t" + sum[i][j]);

            }
            System.out.println();

        }

    }
}
