import java.util.Scanner;

public class Consonant_Vowel_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine().toLowerCase();
        String vowels = "";
        String consonant = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is an vowel");
                vowels += ch;

            } else {
                System.out.println(ch + " is an consonent");
                consonant += ch;

            }

        }
        System.out.println(vowels + " is an vowel");
        System.out.println(consonant + " is an consonant");

    }

}
