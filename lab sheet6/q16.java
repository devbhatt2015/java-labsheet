import java.io.IOException;
import java.text.ParseException;
public class q16 {
 static void processData(boolean fileProblem, boolean parseProblem)
 throws IOException, ParseException {
 if (fileProblem) {
 throw new IOException("File operation failed");
 }if (parseProblem) {
 throw new ParseException("Data parsing failed", 0);
 }
 System.out.println("Data processed successfully.");
 }
 public static void main(String[] args) {
 try {
 processData(false, true);
 } catch (IOException e) {
 System.out.println("IO problem: " + e.getMessage());
 } catch (ParseException e) {
 System.out.println("Parsing problem: " + e.getMessage());
 }
 }
}