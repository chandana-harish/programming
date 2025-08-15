import java.util.Scanner;

class vowel_consonent {
    public void check_vowel_consonent(char alphabet) {
         char lowerCh = Character.toLowerCase(alphabet);

        // "aeiou".indexOf('a') == 0
        // "aeiou".indexOf('e') == 1
        // "aeiou".indexOf('i') == 2
        // "aeiou".indexOf('z') == -1

        if ("aeiou".indexOf(lowerCh) == -1) {
            System.out.println(alphabet + " is an consonent");
        } else {
            System.out.println(alphabet + " is an vowel");
        }

        if ("aeiou".indexOf(lowerCh) != -1) {
            System.out.println(alphabet + " is an vowel");
        } else {
            System.out.println(alphabet + " is an consonent");
        }

        if ("aeiou".indexOf(lowerCh) >= 0) {
            System.out.println(alphabet + " is an vowel");
        } else {
            System.out.println(alphabet + " is an consonent");
        }

        // Add an array case
    }
}

public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        String inputStr = sc.next();
        char alphabet = inputStr.charAt(0);
        vowel_consonent vowel = new vowel_consonent();
        vowel.check_vowel_consonent(alphabet);
    }
}
