package javaapplication1;

public class BitWiseOp {
    public static void main(String[] args) {
       
        int a = 32, b=12, c;
        
        c = a&b; //32 and 12 er binary gun kore jeta asbe setai
        System.out.println("a & b = "+c);
        
        c = a|b; //32 and 12 er binar jog kore jeta asbe setai
        System.out.println("a | b = "+c);
        
        c = a^b; //32 and 12 er binary kore, bijor songkhok 1 thakle output 1 hbe, evabe binary kore jeta result asbe setai
        System.out.println("a ^ b = "+c);
        
        c = a>>3; //dandike 1 ghor kore sora mane vag kora, ekhane a=32 ache, taile 32 k 1st a 2 diye vag korte hbe, then 16 k 2 diye vag, then 8 k 2 diye vag korle 4 asbe
        //32/2=16/2=8/2=4
        System.out.println("a>>3 = "+c);
        
        c = b<<3; //bamdike shift mane gun kora, ekhane b er man 12, mane b er man k 3 bar 2 diye gun korte hbe. like, 12*2=24*2=48*2=96
        System.out.println("b<<3 = "+c);
        
        
        
    }
}
