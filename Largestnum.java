import java.util.Scanner;

class largest_num {
    public void largest_number(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is greater");
        } else if (num2 > num3) {
            System.out.println(num2 + "is greater");
        } else {
            System.out.println(num3 + "is greater");
        }
    }
}

public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        largest_num number = new largest_num();
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the third number");
        int num3 = sc.nextInt();
        number.largest_number(num1, num2, num3);

    }

}
