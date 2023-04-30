import java.util.Scanner;
 
public class Program9UserInputExercice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
        System.out.print("Your first name : ");
        String firstName=input.next();
 
        System.out.print("Your last name : ");
        String lastName=input.next();
 
        System.out.print("Your age : ");
        int age=input.nextInt();
 
        System.out.print("Your weight : ");
        double weight=input.nextDouble();
 
        System.out.println();
        System.out.println("***********");
        System.out.println("* Summary *");
        System.out.println("***********");
 
//        System.out.printf("First name : %s",firstName);
//        System.out.printf("Last name : %s",lastName);
//        System.out.printf("Age : %d",age);
//        System.out.printf("Weight : %s",weight);
 
        System.out.printf("First name : %s\n",firstName);
        System.out.printf("Last name : %s\n",lastName);
        System.out.printf("Age : %d\n",age);
        System.out.printf("Weight : %s\n",weight);
    }
}