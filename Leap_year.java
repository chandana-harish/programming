
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start year");
        int start_year = sc.nextInt();
        System.out.println("enter the start year");
        int end_year = sc.nextInt();
        // 2028
        for(int year=start_year;year<=end_year;year++){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year+ " is leap year");
        } 
    }
}

}
    
