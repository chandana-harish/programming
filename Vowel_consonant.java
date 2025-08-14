import java.util.Scanner;

class vowel_consonent {
    public void check_vowel_consonent(char alphabet) {
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
                || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println(alphabet + " is an vowel");
        } else {
            System.out.println(alphabet + " is an consonent");

        }

    }
}

public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char alphabet = sc.next().charAt(0);
        vowel_consonent vowel = new vowel_consonent();
        vowel.check_vowel_consonent(alphabet);
    }

}
