 //a program to check if a string is a palindrome.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String word=sc.nextLine();
        String reversed_str="";
        for(int i=word.length()-1;i>=0;i--){
            reversed_str=reversed_str+word.charAt(i);

     
        }
        System.out.println(reversed_str);
        if(reversed_str.equals(word)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("its not ");
        }
    

        boolean ispalindrome=true;
        int i=0;
        int j=word.length()-1; 
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){

            
            ispalindrome=false;
            break;
            }
        
        i++;
        j--;
}
    if(ispalindrome){
        System.out.println("its palindrome");
    }else{
        System.out.println("not ");
    }
 
}
}

