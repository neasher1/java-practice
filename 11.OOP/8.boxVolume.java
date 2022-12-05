
package PrblmSolving;

public class Box {
    
    double height, width, depth;
    
    Box(double h, double w, double d){
    
        height = h;
        width = w;
        depth = d;
        
    }
    
    void displayVol(){
    
        double volume = height * width * depth;
        System.out.println("Voume is = "+volume);
    
    }
    
}

class BoxVolume {
    
    public static void main(String[] args) {
       
        Box obj = new Box(10,10,10);
        Box obj1 = new Box(20,30,10);
        
        obj.displayVol();
        obj1.displayVol();
        
    }
    
}
