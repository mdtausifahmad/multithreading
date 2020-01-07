package sample;

/**
 * User: MD.Ahmad
 * Date: 12/7/2019 3:09 PM
 */
public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            System.out.println("We are in thread: "+ Thread.currentThread().getName());
            System.out.println("Current thread priority is "+ Thread.currentThread().getPriority());
        });


        thread.setName("Worker Thread 1");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread "+ Thread.currentThread().getName()+" befor starting new Thread");
        thread.start();
        System.out.println("We are in thread "+Thread.currentThread().getName() +" after starting new thread");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
