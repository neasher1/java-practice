package Abstract;

public interface Interface2 {
    public abstract void play();
}

interface A {

    public abstract void play();
    
}

class B implements Interface2,A{

    @Override
    public void play(){
    
        System.out.println("I am playing Cricket");
    
    }

}

class MainB{

    public static void main(String[] args) {
      
        B obj = new B();
        obj.play();
        
    }

}
