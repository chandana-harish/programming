import java.util.Scanner;

public class natural_numbers_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        /*int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("sum of "+num+" natural numbers is: "+sum);*/
    
      
        String number=sc.nextLine();
        String[] result=number.split(" ");
        
        int sum1=0;
        for(int i= 0;i<result.length;i++){
            sum1=sum1+Integer.parseInt(result[i]);
        }
        System.out.println("sum of "+number+" natural numbers is: "+sum1);

    
}}
