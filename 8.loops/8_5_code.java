import java.util.Scanner;
 
public class Program16WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Please set a 4-digit PIN: ");
        int pin = input.nextInt();
 
 
        int pinToTest;
        do {
            System.out.print("Please enter the PIN to unlock the device: ");
            pinToTest = input.nextInt();
        } while (pinToTest != pin);
    }
}