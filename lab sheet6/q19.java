class InvalidMarksException extends Exception {
 InvalidMarksException(String message) {
 super(message);
 }
}
public class q19 {
 static void checkMarks(int marks) throws InvalidMarksException {
 if (marks < 0 || marks > 100) {
 throw new InvalidMarksException("Marks must be from 0 to 100.");
 }
 System.out.println("Accepted marks = " + marks);
 }
 public static void main(String[] args) {
 int[] testMarks = {85, 105, 72};
 for (int marks : testMarks) {
 try {

 checkMarks(marks);
 } catch (InvalidMarksException e) {
 System.out.println("Rejected: " + e.getMessage());
 }
 }
 }
}
