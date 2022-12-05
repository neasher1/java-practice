package MultiThread;

public class MultiThread1 {

    public static void main(String[] args) throws InterruptedException {
        
        A obj = new A();
        obj.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(1);
                Thread.sleep(500);
        }

    }
}

class A extends Thread{
    
    @Override
    public void run(){
    
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(2);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    
    }

}
