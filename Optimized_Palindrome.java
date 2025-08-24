import java.util.Scanner;

public class Optimized_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String word = sc.nextLine();
        int left = 0;
        boolean is_palindrome = true;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                is_palindrome = false;
                break;

            }
            left++;
            right--;
        }
        if (is_palindrome) {
            {
                System.out.println(word + " its palindrome");
            }
        } else {
            System.out.println(word + " its not palindrome");
        }

    }
}
