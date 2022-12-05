
package oop;

public class Constructor4 {
    
    String name, gender;
    int age;
    
    //parameterized constructor
    Constructor4(String n, String g, int a){
    
        name = n;
        gender = g;
        age = a;
    
    }
    
    void display(){
    
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
    
    }
    
}

class cons{

    public static void main(String[] args) {
       
        Constructor4 obj = new Constructor4("Neasher","Male",23); //initialized constructor in object
        obj.display();
        
    }

}
