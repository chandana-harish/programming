import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String word=sc.nextLine();
        String reversed_str="";
        int i=word.length()-1;  
        while(i>=0){
          reversed_str=reversed_str+word.charAt(i);
          i--;
        }

        System.out.println("reversed string"+reversed_str);
        char[] arr= word.toCharArray();
        int left=0;
        int right=word.length()-1;
        while(left<right){
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String revereString=new String(arr);
        System.out.println(revereString);

    }

}
