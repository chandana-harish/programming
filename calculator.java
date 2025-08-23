import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        float number1= sc.nextFloat();
        System.out.println("enter the second number");
        float number2= sc.nextFloat();
        System.out.println("enter the operator");
        int operator=sc.next().charAt(0);
        float result;
      
        switch(operator){
            case '+':{
                result=number1+number2;
                System.out.println("addition of a number is:"+result);
                break;
            }
            case '-':{
                result=number1-number2;
                System.out.println("subtraction of a number is:"+result);
                break;
            }
            case '*':{
                result=number1*number2;
                System.out.println("multiplication of a number is:"+result);
                break;
            }
            case '/':{
                result=number1/number2;
                System.out.println("division of a number is:"+result);
                break;
            }
            
        }
          
    
    }}
