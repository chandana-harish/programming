import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the staring");// chanduu
        String vowel = sc.nextLine();
        String case_vo = vowel.toLowerCase();//
        char[] words = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;

        for (int i = 0; i < case_vo.length(); i++) {
            char ch = case_vo.charAt(i);
            boolean found = false;
            for (char vow : words)

            {
                if (ch == vow) {
                    found = true;
                    count = count + 1;
                    break;

                }
            }

            if (found) {
                System.out.println(ch + "its an vowel");
            } else {
                System.out.println(ch + "not a vowel ");
            }

        }
        System.out.println("count is" + count);
    }

}
