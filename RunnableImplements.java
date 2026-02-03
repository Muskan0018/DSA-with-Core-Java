// class Z implements Runnable {
//     public void run() {
//         for(int i = 1; i <= 5; i++){
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10); // Sleep for 10 milliseconds
//             } catch (InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }

// }

class Y implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hey..");
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class RunnableImplements {
    public static void main(String[] args) {
        Runnable z1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10); // Sleep for 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Y y1 = new Y();

        Thread t1 = new Thread(z1);
        Thread t2 = new Thread(y1);

        t1.start();
        t2.start();
    }
}
