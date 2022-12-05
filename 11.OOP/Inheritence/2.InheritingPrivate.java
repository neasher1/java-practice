package oop;

public class InheriPrivate13 {
    
    private String name;
    private int age;
    
    public void setName(String name){
    
        this.name = name;
    
    }
    
    public String getName(){
    
        return name;
    
    }
    
    public void setAge(int age){
    
        this.age = age;
    
    }
    
    public int getAge(){
    
        return age;
    
    }
    
    
}

class person extends InheriPrivate13{
    
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    void display(){
        System.out.println("Name: "+getName());   
        System.out.println("Age: "+getAge());   
        System.out.println("Country: "+getCountry()); 
        System.out.println(); 
    }

}

class inheriPri{
    public static void main(String[] args) {
       
        person obj = new person();
        obj.setAge(23);
        obj.setName("Neasher");
        obj.setCountry("BD");
        obj.display();
        
        person obj1 = new person();
        obj1.setAge(25);
        obj1.setName("Hridoy");
        obj1.setCountry("BD");
        obj1.display();
        
    }
}
