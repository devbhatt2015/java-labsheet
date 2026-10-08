class BankAccount {
    int balance = 100000;
    private final Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(10);
        }
    }
}

public class Q12_SynchronizedBlock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.balance);
    }
}