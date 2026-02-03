// Multithreading is a process of executing multiple threads simultaneously.

// Thread Priority:
// Each thread has a priority that helps the thread scheduler to decide the order in which threads are executed.
// Thread priorities are represented by integers ranging from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY).

// sleep() Method - 
// The sleep() method causes the current thread to pause execution for a specified number of milliseconds.

class Hello extends Thread{
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println("Hello");
            try{
            Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Hey extends Thread{
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println("Hey");
            try{
            Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}

public class MultiThread {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hey h2 = new Hey();

        // System.out.println(h1.getPriority());

        h2.setPriority(Thread.MAX_PRIORITY);

        h1.start();
        try{
            Thread.sleep(5); // Sleep for 5 milliseconds
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        h2.start();


    }
}
