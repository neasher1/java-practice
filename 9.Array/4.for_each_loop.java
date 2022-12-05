package array;

public class For_each_loop {

    public static void main(String[] args) {

        String[] names = {"Neasher", "Ahmed", "Hridoy"};
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double sum = 0;

        for (String x : names) {

            System.out.print(x + " ");

        }
        System.out.println();

        for (int x1 : num) {

            System.out.println(x1);

        }

        for (int x1 : num) {

            sum = sum + x1;

        }
        System.out.println("Sum = " + sum);

    }
}
