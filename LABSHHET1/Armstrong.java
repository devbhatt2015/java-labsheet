import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        if (n >= 100 && n <= 999) {
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit * digit;
                n = n / 10;
            }

            if (sum == original)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not an Armstrong Number");
        } else {
            System.out.println("Please enter a 3-digit number.");
            sc.close();
        }
    }
}
