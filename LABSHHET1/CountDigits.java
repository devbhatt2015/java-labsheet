import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            if (n < 0)
                n = -n;

            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println("Number of digits = " + count);
        sc.close();
    }
}