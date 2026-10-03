public class q5{
 public static void main(String[] args) {
 int[] values = {10, 20, 30};
 try {
 int result = values[5] / 0;
 System.out.println(result);
 } catch (ArrayIndexOutOfBoundsException e) {

 System.out.println("Array index is invalid.");
 } catch (ArithmeticException e) {
 
 System.out.println("Arithmetic error occurred.");
 }
 }
}
