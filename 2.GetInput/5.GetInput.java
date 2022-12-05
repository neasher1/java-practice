
package javaapplication1;

import java.util.Scanner;

public class GetInput1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        System.out.println("Number = " + number1);

        int number2 = input.nextInt();
        System.out.println("Number = " + number2);

        int sum = number1 + number2;
        System.out.println(sum);

    }

}
