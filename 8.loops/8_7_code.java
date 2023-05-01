import java.util.Scanner;
 
public class Program16WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please set a 4-digit PIN: ");
        int pin = input.nextInt();
        int attempts = 0;
        boolean isUnlocked = false;
 
        int pinToTest;
 
        do{
            System.out.print("Please enter the PIN to unlock the device: ");
            pinToTest = input.nextInt();
            attempts++;
            if(pinToTest==pin){
                isUnlocked=true;
                break;
            }else {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }while (attempts < 5);
        if(isUnlocked){
            System.out.println("Device unlocked successfully!");
        }else {
            System.out.println("Too many incorrect attempts. Access denied.");
        }
 
    }
}