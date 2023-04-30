import java.util.Scanner;
 
public class Program12ConditionsIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Your age : ");
        int age=input.nextInt();
        boolean isAdult=age>=18;
        if(isAdult){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }
}