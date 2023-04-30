import java.util.Scanner;

public class Program8AcceptingUserInputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
        //System.out.println("Enter the first value : ");
        System.out.print("Enter the first value : ");
        int number1=input.nextInt();
 
        //System.out.println("Enter the second value : ");
        System.out.print("Enter the second value : ");
        int number2=input.nextInt();
 
        int sum=number1+number2;
 
        System.out.printf("%d + %d = %d",number1,number2,sum);
 
    }
}