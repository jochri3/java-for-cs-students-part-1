import java.util.Scanner;
public class Program17ArraysIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
        System.out.print("How many grades would you like to input?: ");
        int numOfPhysicsGrades=input.nextInt();
 
        // We are initializing the physics grades of a student
        double[] physicsGrades=new double[numOfPhysicsGrades];
 
        for (int i=0;i<=numOfPhysicsGrades-1;i++){
            System.out.printf("Grade[%d] : ",i); // Grade[0] : Grad[1]:
            physicsGrades[i]=input.nextDouble();
        }
 
 
 
 
        // We display the grades from the array
        for(int i=0;i<=numOfPhysicsGrades-1;i++){
            System.out.println(physicsGrades[i]);
        }
 
        // We are calculating the sum of all physics grades
        double sumOfPhysicsGrades=0;
        for(int i=0;i<=numOfPhysicsGrades-1;i++){
            sumOfPhysicsGrades = sumOfPhysicsGrades+physicsGrades[i];
        }
 
        // We are calculating the average of all physics grades
        double averagePhysicsGrade = sumOfPhysicsGrades / numOfPhysicsGrades;
 
        // We are printing the sum and average of all physics grades with appropriate formatting
        System.out.printf("Sum: %.2f\nAverage: %.2f", sumOfPhysicsGrades, averagePhysicsGrade);
 
    }
}