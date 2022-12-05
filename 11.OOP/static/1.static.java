
package Static;

public class Static1 {
    //instance variable
    String name;
    int id;
    
    //Static or class variable
    static String university = "PEC"; 
    
    Static1(String n, int i){
    
        name = n;
        id = i;
    
    }
    
    void displayInfo(){
    
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University : "+university);
        System.out.println();
    
    }
    
}

class main{

    public static void main(String[] args) {
       
        Static1 obj = new Static1("Neasher",1234);
        //obj instance variable er jonno memory te jaiga nibe but static or class
        // variable er jonno jaiga nibe na, borong objct class ke refer korbe class variable ke access korar jonno
        
        Static1 obj1 = new Static1("Hridoy",1234);
        
        obj.displayInfo();
        obj1.displayInfo();
        
    }

}
