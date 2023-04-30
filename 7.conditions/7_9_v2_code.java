import java.util.Scanner;
 
public class Program13MultipleConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a language: ");
        String language = input.next();
 
        if (language.equalsIgnoreCase("lingala")) {
            System.out.println("Mbote");
        }else if(language.equalsIgnoreCase("french")) {
            System.out.println("Salut!");
        }else if (language.equalsIgnoreCase("english")) {
            System.out.println("Hello");
        }else if (language.equalsIgnoreCase("spanish")) {
            System.out.println("Holla");
        }else {
            System.out.println("Unsupported language");
        }
    }
}