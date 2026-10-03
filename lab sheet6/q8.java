import java.io.IOException;
public class q8{
 static void readData() throws IOException {

 throw new IOException("Input operation failed");
 }
 public static void main(String[] args) {
 try {
 readData();
 } catch (IOException e) {
 System.out.println("Handled: " + e.getMessage());
 }
}}