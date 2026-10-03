import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        if (n < 0)
            n = -n;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (reverse == Math.abs(original))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}
