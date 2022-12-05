package javaapplication1;


public class BreakContinue20 {
    public static void main(String[] args) {
       
        for(int i=1; i<=100; i++){
            
            if(i==10)
                break;
            
            System.out.println(i);
            
        }System.out.println("");
        
        for(int i=1; i<=100; i=i+3){
            
            if(i==10)
                break;
            
            System.out.println(i);
            
        }
        
        System.out.println("");
        for(int i=1; i<=20; i++){
            
            if(i==10)
                continue;
            
            System.out.println(i);
            
        }
        System.out.println("");
        
        for(int i=1; i<=20; i=i+3){
            
            if(i==10)
                continue;
            
            System.out.println(i);
            
        }
        
        
    }
}
