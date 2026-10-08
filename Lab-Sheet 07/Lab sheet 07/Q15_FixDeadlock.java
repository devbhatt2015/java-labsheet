class Lock1 {
}

class Lock2 {
}

class Thread1 extends Thread {
    Lock1 lock1;
    Lock2 lock2;

    Thread1(Lock1 lock1, Lock2 lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("Thread 1 locked Lock1");

            synchronized (lock2) {
                System.out.println("Thread 1 locked Lock2");
            }
        }
    }
}

class Thread2 extends Thread {
    Lock1 lock1;
    Lock2 lock2;

    Thread2(Lock1 lock1, Lock2 lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("Thread 2 locked Lock1");

            synchronized (lock2) {
                System.out.println("Thread 2 locked Lock2");
            }
        }
    }
}

public class Q15_FixDeadlock {
    public static void main(String[] args) {
        Lock1 lock1 = new Lock1();
        Lock2 lock2 = new Lock2();

        Thread1 t1 = new Thread1(lock1, lock2);
        Thread2 t2 = new Thread2(lock1, lock2);

        t1.start();
        t2.start();
    }
}