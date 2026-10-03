class InvalidDosageException extends RuntimeException {
 InvalidDosageException(String message) {
 super(message);
 }
}
public class q13 {
 static void validateDosage(double dose) {
 if (dose <= 0) {

 throw new InvalidDosageException("Dosage must be greater than zero.");
 }
 System.out.println("Valid dosage: " + dose + " mg");
 }
 public static void main(String[] args) {
 try {
 validateDosage(-5);
 } catch (InvalidDosageException e) {
 System.out.println(e.getMessage());
 }}}
