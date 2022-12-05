package Polymorphism;

public class Polymorphism2 {
    
    void display(){
        System.out.println("I am Parent");
    }
    
}

class person extends Polymorphism2{

    @Override
    void display(){
    
        System.out.println("I am person");
    
    }

}

class student extends Polymorphism2{

    @Override
    void display(){
    
        System.out.println("I am student");
    
    }

}


class poly{

    public static void main(String[] args) {
       
        Polymorphism2 obj = new Polymorphism2();
        obj.display();
        
        //parent class er reference variable "obj" refer kortese sub class "student()" er object k
        //runtime or dynamic dispatch polymorphism
        obj = new student();
        obj.display();
        
        obj = new person();
        obj.display();
        
    }

}
