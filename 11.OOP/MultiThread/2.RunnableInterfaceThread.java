package MultiThread;


public class RunnableInterfaceThread {
    public static void main(String[] args) {
       
        A obj = new A();
        
        Thread t1 = new Thread(obj);
        t1.start();
        
    }
}

class A extends B implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 

        }

    }

}
class B{}
