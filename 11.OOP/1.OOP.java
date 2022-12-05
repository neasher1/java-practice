package oop;

public class OOP1 {

    //class er variables or property
    String name, gender, phn;
    int age;

}

class Test {

    public static void main(String[] args) {

        OOP1 object = new OOP1();  //object declared and created  
        OOP1 object1 = new OOP1();
        
        //initialization
        object.name = "Neasher";
        object.gender = "Male";
        object.phn = "01303970740";
        object.age = 23;
        
        System.out.println("Name : "+object.name);
        System.out.println("Gender : "+object.gender);
        System.out.println("Phn No : "+object.phn);
        System.out.println("Age : "+object.age);
        System.out.println();
        
        object1.name = "Hasib";
        object1.gender = "Male";
        object1.phn = "xxxxxxxxxx";
        object1.age = 24;
        
        System.out.println("Name : "+object1.name);
        System.out.println("Gender : "+object1.gender);
        System.out.println("Phn No : "+object1.phn);
        System.out.println("Age : "+object1.age);
        

    }

}
