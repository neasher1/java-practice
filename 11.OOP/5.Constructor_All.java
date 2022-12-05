
package oop;

public class ConstructorAll5 {
    
    String name, gender;
    int age;
    
    //default constructor
    ConstructorAll5(){
    
        System.out.println("No Value");
        
    }
    
    //parameterized constructor
    ConstructorAll5(String n, String g, int a){
    
        name = n;
        gender = g;
        age = a;
        
    }
    
    void display(){
    
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println();
    
    }
    
}

class main2{
    public static void main(String[] args) {
       
        ConstructorAll5 obj = new ConstructorAll5("Neasher","Male",23);
        obj.display();
       
        ConstructorAll5 obj1 = new ConstructorAll5("Neasher","Male",23);
        obj1.display();
       
        ConstructorAll5 obj2 = new ConstructorAll5();
        obj2.display();
        
    }

}
