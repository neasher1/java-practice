package array;

import java.util.Scanner;

public class Max_mini3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0;

        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < num.length; i++) {

            num[i] = input.nextDouble();

        }

        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];

        }

        double avg = sum / num.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        double max = num[0];
        double min = num[0];

        for (int i = 1; i < num.length; i++) {

            if (max < num[i]) {
                max = num[i];
            }

            if (min > num[i]) {
                min = num[i];
            }

        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }
}
