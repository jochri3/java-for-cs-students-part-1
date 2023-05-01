import java.util.Scanner;
public class Program17ArraysIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numOfPhysicsGrades=0;
        do{
            System.out.print("How many grades would you like to input?: ");
            numOfPhysicsGrades=input.nextInt();
            if(numOfPhysicsGrades<=0){
                System.out.println("Error.The number of grade should be strictly positive, please try again.");
            }
        }while(numOfPhysicsGrades<=0);
 
 
 
        // We are initializing the physics grades of a student
        double[] physicsGrades=new double[numOfPhysicsGrades];
 
        for (int i=0;i<numOfPhysicsGrades;i++){
            double grade = 0;
            do{
                System.out.printf("Grade[%d] : ",i);
                grade=input.nextDouble();
                if(grade<0 || grade>20){
                    System.out.println("Error. The grade should be within 0 and 20, please try again.");
                }
            }while(grade<0 || grade>20);
            physicsGrades[i]=grade;
        }
 
 
        // We display the grades from the array
        for(int i=0;i<numOfPhysicsGrades;i++){
            System.out.println(physicsGrades[i]);
        }
 
        // We are calculating the sum of all physics grades
        double sumOfPhysicsGrades=0;
        for(int i=0;i<numOfPhysicsGrades;i++){// i=i+2 i+=2
            sumOfPhysicsGrades+= physicsGrades[i];
        }
 
        // We are calculating the average of all physics grades
        double averagePhysicsGrade = sumOfPhysicsGrades / numOfPhysicsGrades;
 
        // We are printing the sum and average of all physics grades with appropriate formatting
        System.out.printf("Sum: %.2f\nAverage: %.2f", sumOfPhysicsGrades, averagePhysicsGrade);
 
    }
}