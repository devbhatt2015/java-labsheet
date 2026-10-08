import java.util.Random;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        Random r = new Random();
        int time = r.nextInt(501);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " is running");
    }
}

public class Q5_ThreeThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Reader");
        MyThread t2 = new MyThread("Writer");
        MyThread t3 = new MyThread("Logger");

        t1.start();
        t2.start();
        t3.start();
    }
}
