import java.util.Scanner;

public class factors_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int i=1;
        while(i<=number){
            if(number%i==0){
                System.out.println("the factors are:"+i);}
     
            i++;
        }
    }
    
}
