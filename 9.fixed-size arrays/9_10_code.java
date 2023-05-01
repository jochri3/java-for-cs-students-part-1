import java.util.Scanner;
 
public class Program17ArraysIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfPhysicsGrades = 0;
        while (true) {
            System.out.print("How many grades would you like to input?: ");
            numOfPhysicsGrades = input.nextInt();
            if (numOfPhysicsGrades > 0)
                break;
            System.out.println("Error.The number of grade should be strictly positive, please try again.");
 
        }
 
        // We are initializing the physics grades of a student
        double[] physicsGrades = new double[numOfPhysicsGrades];
 
        for (int i = 0; i < numOfPhysicsGrades; i++) {
            double grade = 0;
            while (true) {
                System.out.printf("Grade[%d] : ", i);
                grade = input.nextDouble();
                if (grade >= 0 && grade <= 20)
                    break;
                System.out.println("Error. The grade should be within 0 and 20, please try again.");
 
            }
            physicsGrades[i] = grade;
        }
 
 
        // We display the grades from the array
        for (double grade: physicsGrades) {//6 12
            System.out.println(grade);
        }
 
        // We are calculating the sum of all physics grades
        double sumOfPhysicsGrades = 0;
        for (double grade: physicsGrades) {
            sumOfPhysicsGrades += grade;
        }
 
        // We are calculating the average of all physics grades
        double averagePhysicsGrade = sumOfPhysicsGrades / numOfPhysicsGrades;
 
        // We are printing the sum and average of all physics grades with appropriate formatting
        System.out.printf("Sum: %.2f\nAverage: %.2f", sumOfPhysicsGrades, averagePhysicsGrade);
 
    }
}