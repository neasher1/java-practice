package PrblmSolving;

public class Triangle {

    int s1 = 3;
    int s2 = 4;
    int s3 = 5;

}

class main3 {

    public static void main(String[] args) {

        Triangle obj = new Triangle();
        
        int perimeter = obj.s1 + obj.s2 + obj.s3;
        int semiP = perimeter/2;
        double area = Math.sqrt(semiP*((semiP-obj.s1)*(semiP-obj.s2)*(semiP-obj.s3)));
        
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Area = "+area);

    }

}
