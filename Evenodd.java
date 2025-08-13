import java.util.Scanner;

class Oddeven {
    public void checksevenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        Oddeven numOddeven = new Oddeven();
        numOddeven.checksevenodd(num);

    }
}
