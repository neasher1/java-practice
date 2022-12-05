package oop;
public class InheriOverriding14 {
    
    String name;
    int age;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    void display(){
    
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Location: "+getLocation());
    
    }
    
}

class person extends InheriOverriding14{

    String country;
    
    @Override
    void display(){
    
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("country: "+country);
        System.out.println("Location: "+getLocation());
    
    }

}

class overriding{

    public static void main(String[] args) {
       
        person obj = new person();
        obj.name = "Neasher";
        obj.age = 23;
        obj.country = "BD";
        obj.setLocation("Pabna");
        obj.display();
        
    }

}
