package MultiThread;

public class MultiThread4 {
    public static void main(String[] args) throws InterruptedException {
       
        D obj = new D();
        obj.start();
        
        obj.join();
        System.out.println(obj.x);
        
    }
}

class D extends Thread{
    
    int x;
    
    @Override
    public void run(){
    
        for (int i = 0; i < 100000; i++) {
            x++;
        }
    
    }

}
