import java.util.Scanner;
 
public class Program12ConditionsIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Your age : ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }
    }
}