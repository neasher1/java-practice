package MultiThread;

public class MultiThread3 {

    public static void main(String[] args) {
       
        C obj = new C();
        
        Thread t1 = new Thread(obj,"My thread 1");
        t1.start();
        
        System.out.println("Inside a Main Thread: "+Thread.currentThread().getName());
        
    }
    
}

class C implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside a Run Thread: "+Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

}
