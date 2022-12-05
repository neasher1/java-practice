package Abstract;

public interface Interface {
    
    public abstract void eat();
    
}

class Cat implements Interface{

    @Override
    public void eat(){
    
        System.out.println("Cat can eat fish");
    
    }

}

class Dog implements Interface{

    @Override
    public void eat(){
    
        System.out.println("Dog can eat Meat"); 
    
    }

}

class MainInter{

    public static void main(String[] args) {
       
        Cat c = new Cat();
        c.eat();
        
        Dog d = new Dog();
        d.eat();
        
    }

}
