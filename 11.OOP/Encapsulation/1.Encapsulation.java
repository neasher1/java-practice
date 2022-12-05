package oop;

import java.util.Scanner;

public class Encapsulation11 {
    
    private String name;
    private int age;
    
    public void setName(String name){
    
        this.name = name;
    
    }
    
    public String getName(){
    
        return name;
    
    }
    
    public void SetAge(int age){
    
        this.age = age;
    
    }
    public int GetAge(){
    
        return age;
        
    }
    
}

class Encap{

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        Encapsulation11 obj = new Encapsulation11();
        System.out.print("ENter name = ");
        String n = input.nextLine();
        obj.setName(n);
        System.out.println("Name = "+obj.getName());
        
        obj.SetAge(25);
        System.out.println("Age = "+obj.GetAge());
        
        
    }

}
