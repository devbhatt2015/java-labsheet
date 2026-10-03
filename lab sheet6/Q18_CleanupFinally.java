public class Q18_CleanupFinally {
 static void process() {
 try {
 System.out.println("Processing started.");
 int value = 100 / 0;
 System.out.println(value);
 } catch (ArithmeticException e) {
 System.out.println("Processing error handled.");
 } finally {
}
 }
 public static void main(String[] args) {
 process();
 }
}
