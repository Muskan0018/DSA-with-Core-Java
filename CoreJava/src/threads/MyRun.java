// Creating thread using Runnable Interface

package threads;

public class MyRun implements Runnable {
    public void run() {
        // task for thread
        for (int i = 1; i <= 10; i++){
            System.out.println("Value of i is: " + i);
            try {
                Thread.sleep(1000);   // for waiting 1 second
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        MyRun t1 = new MyRun();

        Thread thread = new Thread(t1);
        thread.start();
    }
}
