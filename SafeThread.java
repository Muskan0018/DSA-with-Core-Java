
class Counter{
    int count;
    public synchronized void increment(){
        count++;  
    }
}

public class SafeThread {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        
        Runnable z1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable y1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(z1);
        Thread t2 = new Thread(y1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
