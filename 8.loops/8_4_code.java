import java.util.Scanner;
 
public class Program15MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to display the multiplication table for: ");
        int number = input.nextInt();
 
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}