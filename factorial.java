import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int fact=1;
        int n=1;
        while(n<=num){
            fact=fact*n;
            n++;
            System.err.println(fact);
        }
        System.err.println(fact);
    }
    
}
