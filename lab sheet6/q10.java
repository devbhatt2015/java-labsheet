public class q10{
 public static void main(String[] args) {
 try {
 System.out.println("Outer try started");
 try {

 int result = 20 / 0;
 System.out.println(result);
 } catch (ArithmeticException e) {
 System.out.println("Inner catch: division by zero");
 }
 System.out.println("Outer try continues");
 } catch (Exception e) {
 System.out.println("Outer catch: " + e.getMessage());
 }
 }
}