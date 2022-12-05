package basicjava;

public class DataType4 {
    
    public static void main(String[] args){
    
        boolean b = true; // Dynamic initialization
        char c = 'a';
        int i = 10;
        short s = 23422;
        float f = 12.22f;
        double d = 322.2322;
        
        System.out.println("Boleean b = "+b);
        System.out.println("Char C = "+c);
        System.out.println("Int I = "+i);
        System.out.println("Short S = "+s);
        System.out.println("Float F = "+f);
        System.out.println("Double D = "+d);
        System.out.println("");
        
        //Printing with format specifire in printf() method
        System.out.println("Printing with format specifire in printf() method \n\n");
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Char c = %c\n",c);
        System.out.printf("Int I = %d\n",i);
        System.out.printf("Short S = %d\n",s);
        System.out.printf("float f = %f\n",f);
        System.out.printf("double d = %f\n",d);
        
    }
    
}

