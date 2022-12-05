
package Static;

public class Static_Block5 {
    
    static String name;
    static int id;
    
    //static block
    static{
    
        name = "Neasher";
        id = 123354;
    
    }
    
    static void display(){
    
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    
    }
    
    public static void main(String[] args) {
       
        Static_Block5.display();
        
    }
    
}
