import java.util.Scanner;

public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        System.out.println("Enter the divident");
        int divident = sc.nextInt();
        int result = divident / divisor;
        System.out.println("Result: " + result);
    }
}
