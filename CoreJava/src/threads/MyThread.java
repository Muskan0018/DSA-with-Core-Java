// Creating thread using Thread Class

package threads;

public class MyThread extends Thread {
    public void run(){
        // task for thread
        for(int i = 10; i >= 1; i--){
            System.out.println("Another thread: " + i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
