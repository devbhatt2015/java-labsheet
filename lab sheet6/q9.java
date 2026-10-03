public class q9{
 static void methodC() {

 int result = 10 / 0;
 System.out.println(result);
 }
 static void methodB() {
 methodC();
 }
 static void methodA() {
 methodB();
 }
 public static void main(String[] args) {
 try {
 methodA();
 } catch (ArithmeticException e) {
 System.out.println("Exception handled in main.");
 }
 }
}

