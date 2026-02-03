package threads;

class UserThread extends Thread{
    @Override
    public void run(){
        System.out.println("UserThread");
    }
}

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int x = 54 + 46;
        System.out.println("Sum is: " + x);

// Thread...
        Thread t = Thread.currentThread();
        String tnanme = t.getName();
        System.out.println("Current running thread: " + tnanme);

    // setName
        t.setName("MyThread");
        System.out.println("new thread: "+ t.getName());

        try{
            Thread.sleep(5000);
        }catch (Exception e){}

    // getId
        System.out.println("Thread Id: "+t.getId());

// going to start user defined thread
        UserThread t1 = new UserThread();
        t1.start();

        System.out.println("Program Ended..");
    }
}
