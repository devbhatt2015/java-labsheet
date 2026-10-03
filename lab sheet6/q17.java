class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String message) {
 super(message);
 }
}
public class q17{
 static void withdraw(double balance, double amount)
 throws InsufficientBalanceException {
 if (amount > balance) {

 throw new InsufficientBalanceException("Insufficient balance.");
 }
 System.out.println("Withdrawal successful. Remaining balance = "
 + (balance - amount));
 }
 public static void main(String[] args) {
 try {
 withdraw(5000, 7000);
 } catch (InsufficientBalanceException e) {
 System.out.println(e.getMessage());
 }
 }
}

