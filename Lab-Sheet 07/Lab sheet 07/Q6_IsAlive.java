class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q6_IsAlive {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("While running: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After finish: " + t.isAlive());
    }
}