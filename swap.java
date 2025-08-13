import java.util.Scanner;
class swap1{
    public void swapp(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a"+a);
        System.out.println("b"+b);
    }

   
}
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swap1 sd=new swap1();
        int temp=0;
        int a=sc.nextInt();
        System.out.println("a"+"="+a);
        int b=sc.nextInt();
        System.out.println("b"+"="+b);
        sd.swapp(a,b);
    }
    
}
