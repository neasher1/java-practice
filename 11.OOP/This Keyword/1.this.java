package This;

public class This1 {
    
    String name;
    int age;
    String hairColor;
    
    This1(String name, int age){
    
        this.name = name;
        this.age = age;
    
    }
    
    This1(String name, int age, String hairColor){
    
        this(name,age);
        this.hairColor = hairColor;
    
    }
    
    void display(){
    
        System.out.println("Name: "+name);
        System.out.println("AGe: "+age);
        System.out.println("Hair Color: "+hairColor);
        System.out.println();
    
    }
    
}

class main{

    public static void main(String[] args) {
       
        This1 obj = new This1("Neasher",23);
        obj.display();
       
        This1 obj1 = new This1("Hridoy",23,"Balck");
        obj1.display();
        
    }

}
