import java.util.Scanner;

class Numbers {
    public void checkspositive_negative_num(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("number is zero");
        }

    }
}

public class Positivenegativenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        Numbers nums = new Numbers();
        nums.checkspositive_negative_num(num);

    }
}
