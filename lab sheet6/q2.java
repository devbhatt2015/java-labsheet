import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}