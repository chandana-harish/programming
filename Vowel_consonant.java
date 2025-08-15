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
        switch (lowerCh) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println(alphabet + " is an vowel");
                break;
            }
        }
        char[] lowerCh1 = { 'a', 'e', 'i', 'o', 'u' };
        boolean found = false;
        for (char temp_var : lowerCh1) {

            if (lowerCh == temp_var) {
                found = true;
                break;

            }
        }
        if (found) {
            System.out.println(alphabet + " is an vowel");
        } else {
            System.out.println(alphabet + " is an consonant");
        }

    }

    // Add an array case and also switch case

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
