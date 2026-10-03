import java.util.Scanner;

class SquareRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length == breadth)
            System.out.println("It is a Square");
        else
            System.out.println("It is a Rectangle");
        sc.close();
    }
}