import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        // 2028
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("its leap year" + year);
        } else {
            System.out.println("its not an leap year");
        }
    }

}
// num should be divisible by 4-leap year,//num should not be divisible by
// 100-not a leap year

// num should be divisible by 400-leap year
// create a func name is leap_year boolean isLeapYear(int year)
// public static boolean isLeapYear(int year) { it shd take two yea