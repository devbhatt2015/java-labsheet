class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    long getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    double getBalance() {
        return balance;
    }

    void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

public class Q2_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber(123456789);
        account.setAccountHolder("Vanshika");
        account.setBalance(5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(10000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}