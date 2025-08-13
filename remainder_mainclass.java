import java.util.Scanner;
class remainders{
    public int remainder_method(int divident,int divisor){
        int result=divident%divisor;
        return result;

    }

}

public class remainder_mainclass {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        remainders rd=new remainders();
        System.out.println("enter the divisor");
        int divisor=sc.nextInt();
        System.out.println("enter the divident");
        int divident=sc.nextInt();
        int final_remainder=rd.remainder_method(divident, divisor);
        System.out.println("Remainder is:"+final_remainder);
}
}
