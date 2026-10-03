public class q15 {
 public static void main(String[] args) {
 String input = "90";
 int[] marks = {80, 85, 90};
 try {
 
 int extra = Integer.parseInt(input);
 System.out.println("Extra value = " + extra);

 System.out.println("Mark = " + marks[5]);
 } catch (NumberFormatException e) {
 System.out.println("Invalid numeric input.");
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Invalid marks index.");
 }
 }
}
