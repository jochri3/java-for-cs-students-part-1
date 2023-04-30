// Version 1
import java.util.Scanner;
 
public class Program13MultipleConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a language: ");
        String language = input.next();
        language=language.toLowerCase();
 
        if (language.equals("lingala")) {
            System.out.println("Mbote");
        }else if(language.equals("french")) {
            System.out.println("Salut!");
        }else if (language.equals("english")) {
            System.out.println("Hello");
        }else if (language.equals("spanish")) {
            System.out.println("Holla");
        }else {
            System.out.println("Unsupported language");
        }
    }
}