
package PrblmSolving;

public class Student1 {
    
    int roll_no, phnNumber;
    String address, name;
    
}

class main2{

    public static void main(String[] args) {
       
        Student1 obj = new Student1();
        Student1 obj1 = new Student1();
        
        obj.name = "Sam";
        obj.address = "Pabna";
        obj.roll_no = 1;
        obj.phnNumber = 234242131;
        
        obj1.name = "John";
        obj1.address = "Kustia";
        obj1.roll_no = 112;
        obj1.phnNumber = 45645645;
        
        System.out.println("Information for Sam");
        System.out.println("Name: "+obj.name);
        System.out.println("Address: "+obj.address);
        System.out.println("Roll Number: "+obj.roll_no);
        System.out.println("Phone Number: "+obj.phnNumber+"\n");
        
        System.out.println("Information for John");
        System.out.println("Name: "+obj1.name);
        System.out.println("Address: "+obj1.address);
        System.out.println("Roll Number: "+obj1.roll_no);
        System.out.println("Phone Number: "+obj1.phnNumber);
        
    }

}
