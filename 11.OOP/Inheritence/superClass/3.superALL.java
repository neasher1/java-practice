package oop;
public class InheriSuperAll17 {
    
}

class vehicle{

    String color;
    double weight;
    
    vehicle(String c, double w){
    
        color = c;
        weight = w;
    
    }
    
    void display(){
    
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    
    }

}

class car extends vehicle{

    int gear;
    
    car(String c, double w, int g){
    
        super(c,w);
        gear = g;
    
    }
    
    @Override
    void display(){
    
        super.display();
        System.out.println("Gear: "+gear);
        System.out.println();
    
    }

}

class Bike extends vehicle{

    int gear;
    
    Bike(String c, double w, int g){
    
        super(c,w);
        gear = g;
    
    }
    
    @Override
    void display(){
    
        super.display();
        System.out.println("Gear: "+gear);
    
    }

}

class SuperALL{

    public static void main(String[] args) {
       
        car obj = new car("Black",2342,3);
        obj.display();
       
        Bike obj1 = new Bike("Red",12312,5);
        obj1.display();
        
    }

}
