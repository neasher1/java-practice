package oop;

public class Inheritence12 {
    String name;
    int age;
    
    void display(){
    
        System.out.println("Name = "+name);
        System.out.println("Agee = "+age);
        
    }
}

class person extends Inheritence12{
    
    String qualification;
    void display1(){
    
        display();
        System.out.println("Qualification = "+qualification);
        
    }

}

class person1 extends person{
    
    String country;
    void display2(){
    
        display1();
        System.out.println("country = "+country);
        
    }

}

class Inheri{

    public static void main(String[] args) {
       
        person1 obj = new person1();
        obj.name = "Neasher";
        obj.age = 23;
        obj.qualification = "CSE";
        obj.country = "BD";
        obj.display2();
        
    }
    
}
