import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine().toLowerCase();
        String vowel="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
        
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              System.out.println(ch +"its vowel");
              vowel+=ch;
            }else{
              System.out.println(ch+"its not vowel");
        }
    }
        
    }
       }
    

