package Abstract;

public abstract class Abstract {
    
    abstract void sendMessage();
    
    void call(){
    
        System.out.println("Call Method");
    
    }
    
}

class Rahim extends Abstract{

    @Override
    void sendMessage(){
    
        System.out.println("I am Rahim");
    
    }

}

class Karim extends Abstract{

    @Override
    void sendMessage(){
    
        System.out.println("I am Karim");
    
    }

}

class Test{
    public static void main(String[] args) {
       
        Abstract obj;
        obj = new Rahim();
        obj.sendMessage();
        obj.call();
        
        obj = new Karim();
        obj.sendMessage();
        
    }
}
