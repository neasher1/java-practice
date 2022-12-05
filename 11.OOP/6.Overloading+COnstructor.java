
package Overloading_Constructor;

public class Teacher {
    String name, gender;
    int age;
    
    Teacher(){
    
        System.out.println("No Information\n");
        
    }
    
    Teacher(String n, String g){
    
        name = n;
        gender = g;
    
    }
    
    Teacher(String n, String g, int a){
    
        name = n;
        gender = g;
        age = a;
    
    }
    
    void DisplayInforMation(){
    
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println();
    
    }
}
public class Main {
    public static void main(String[] args) {
       
        Teacher obj = new Teacher();
        
        Teacher obj1 = new Teacher("Neasher","Male",23);
        obj1.DisplayInforMation();
        
        Teacher obj2 = new Teacher("Hridoy","Male");
        obj2.DisplayInforMation();
    }
}
