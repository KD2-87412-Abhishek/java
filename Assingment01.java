import java.util.*;

public class Assingment01 {
    static Scanner sc = new Scanner(System.in);

    public static void isDouble(double n, double m) {
        double average = (n + m) / 2;
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");

        if (sc.hasNextDouble()) {
            double n1 = sc.nextDouble();
            if (sc.hasNextDouble()) {
                double n2 = sc.nextDouble();
                isDouble(n1, n2);
            } else {
                System.out.println("Invalid input for the second number.");
            }
        } else {
            System.out.println("Invalid input for the first number.");
        }

        sc.close();
    }
}