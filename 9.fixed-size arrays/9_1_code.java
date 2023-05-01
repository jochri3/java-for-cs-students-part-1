public class Program17ArraysIntro {
    public static void main(String[] args) {
        // We are initializing the physics grades of a student
        double physicsGrade1 = 12;
        double physicsGrade2 = 16;
        double physicsGrade3 = 14;
        double physicsGrade4 = 10;
        double physicsGrade5 = 19;
        double physicsGrade6 = 18;
 
        // We are calculating the sum of all physics grades
        double sumOfPhysicsGrades = physicsGrade1 + physicsGrade2 + physicsGrade3 + physicsGrade4 + physicsGrade5 + physicsGrade6;
 
        // We are calculating the average of all physics grades
        double averagePhysicsGrade = (double) sumOfPhysicsGrades / 6;
 
        // We are printing the sum and average of all physics grades with appropriate formatting
        System.out.printf("Sum: %.2f\nAverage: %.2f", sumOfPhysicsGrades, averagePhysicsGrade);
 
    }
}