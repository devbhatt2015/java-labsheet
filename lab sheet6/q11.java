public class  q11{
 public static void main(String[] args) {
 try {
 int[] data = {1, 2};
 System.out.println(data[5]);
 } catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Specific array exception handled.");
 } catch (RuntimeException e) {

 System.out.println("Runtime exception handled.");
 }
 }
}
