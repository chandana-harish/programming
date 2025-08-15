import java.util.Scanner;

class primenumber{
    public int check( int num){
        while (num%2==0) {
            return num;
            
        }
    }

}

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether its even or odd");
        int num = sc.nextInt();
        primenumber prime = new primenumber();
        int result = prime.check(num);
        System.out.println("result is:" + result);

    }

}


      

               

    

