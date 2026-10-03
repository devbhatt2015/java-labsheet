class InvalidAgeException extends Exception {

 InvalidAgeException(String message) {
 super(message);
 }
}
public class q12 {
 static void validateAge(int age) throws InvalidAgeException {
 if (age < 18) {
 throw new InvalidAgeException("Age must be 18 or above.");
 }
 System.out.println("Eligible age: " + age);
 }
 public static void main(String[] args) {
 try {
 validateAge(16);
 } catch (InvalidAgeException e) {
 System.out.println(e.getMessage());
 }
 }
}
