package oop;

import java.util.Scanner;

public class ParametrizedMethod3 {

    String name, gender, phn;
    int age;

    void setInforMation(String n, String g, String p, int a){
        
        name = n;
        gender = g;
        phn = p;
        age = a;
        
    }
    
    void disPlayInfo(){
    
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phn = "+phn);
        System.out.println("Age = "+age);
        System.out.println();
    }
    
    
}

class main1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ParametrizedMethod3 obj = new ParametrizedMethod3();
        ParametrizedMethod3 obj1 = new ParametrizedMethod3();
        ParametrizedMethod3 obj2 = new ParametrizedMethod3();
        
        obj.setInforMation("Neasher","Male","01303xxx",23);
        obj.disPlayInfo();
        
        obj1.setInforMation("Hridoy", "Male", "017829902", 25);
        obj1.disPlayInfo();
        
        System.out.print("Name = ");
        obj2.name = input.nextLine();
        
        System.out.print("Gender = ");
        obj2.gender = input.nextLine();
        
        System.out.print("Phn = ");
        obj2.phn = input.nextLine();
        
        System.out.print("Age = ");
        obj2.age = input.nextInt();
        System.out.println();
        
        obj2.setInforMation(obj2.name, obj2.gender, obj2.phn, obj2.age);
        obj2.disPlayInfo();
        
    }
}
