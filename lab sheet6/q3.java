public class q3 {
    public static void main(String[] args) {

        String str = "123";

        try {
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
    }
}