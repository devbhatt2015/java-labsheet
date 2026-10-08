class MyThread extends Thread {
    public void run() {
        long sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}

public class Q7_Join {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Task finished");
    }
}