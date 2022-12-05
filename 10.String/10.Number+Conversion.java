
package String;

public class Numbering_Conversion10 {
    public static void main(String[] args) {
       
        //Binary, Octal, Hexa ---> Decimal
        
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal = "+decimal);
        
        String octal = "675";
        Integer decimal1 = Integer.parseInt(octal,8);
        System.out.println("Octal to deci = "+decimal1);
        
        String hexa = "F";
        Integer decimal2 = Integer.parseInt(hexa, 16);
        System.out.println("Hexa to deci = "+decimal2);
        System.out.println();
        
        // Decimal ---> Binary, Octal, Hexa 
        int deci = 10;
        String binari = Integer.toBinaryString(deci);
        System.out.println("Deci to binary = "+binari);
        
        String oct = Integer.toOctalString(deci);
        System.out.println("Deci to Octal = "+oct);
        
        String hex = Integer.toHexString(deci);
        System.out.println("Deci to Hex = "+hex);
        
        
    }
}
