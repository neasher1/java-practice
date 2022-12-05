
package Static;

public class Student3 {
    
    static int count = 0;
    
    Student3(){
    
        count++;
    
    }
    
    void display(){
    
        System.out.println("Number of students: "+count);
    
    }
    
}

class test{

    public static void main(String[] args) {
       
        Student3 obj = new Student3();
        obj.display();
       
        Student3 obj1 = new Student3();
        obj1.display();
       
        Student3 obj2 = new Student3();
        obj2.display();
        
    }

}

//
//package Static;
//
//public class Student3 {
//    
//    static int count = 0;
//    
//    Student3(){
//    
//        count++;
//    
//    }
//    
//    static void display(){
//    
//        System.out.println("Number of students: "+count);
//    
//    }
//    
//}
//
//class test{
//
//    public static void main(String[] args) {
//       
//        Student3 obj = new Student3();
//        Student3.display();
//       
//        Student3 obj1 = new Student3();
//        Student3.display();
//       
//        Student3 obj2 = new Student3();
//        Student3.display();
//        
//    }
//
//}
