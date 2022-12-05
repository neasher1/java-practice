
package oop;

import java.util.Scanner;

public class Teacher2 {
    
    //variables
    String name,gender,phn;
    int age;
    
    //method
    void displayInfo(){
    
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phn = "+phn);
        System.out.println("Age = "+age);
        System.out.println();
    }
}

class main{
    public static void main(String[] args) {
     
        Teacher2 obj = new Teacher2();
        Teacher2 obj1 = new Teacher2();
        Teacher2 obj2 = new Teacher2();
        
        obj.name = "Neasher";
        obj.gender = "male";
        obj.phn = "013xxxx";
        obj.age = 23;
        
        obj.displayInfo();
        
        obj1.name = "Hasib";
        obj1.gender = "male";
        obj1.phn = "012xxxx";
        obj1.age = 25;
        
        obj1.displayInfo();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        obj2.name = input.nextLine();
        
        System.out.print("Enter gender: ");
        obj2.gender = input.nextLine();
        
        System.out.print("Enter phn Number: ");
        obj2.phn = input.nextLine();
        
        System.out.print("Enter Age: ");
        obj2.age = input.nextInt();
        System.out.println();
        
        obj2.displayInfo();
        
    }
}
