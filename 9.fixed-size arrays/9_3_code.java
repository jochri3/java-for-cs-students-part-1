public class Program17ArraysIntro {
    public static void main(String[] args) {
        // We are initializing the physics grades of a student
        double[] physicsGrades={12,16,14,10,19,18};
 
        System.out.println(physicsGrades[0]);
        System.out.println(physicsGrades[1]);
        System.out.println(physicsGrades[2]);
        System.out.println(physicsGrades[3]);
        System.out.println(physicsGrades[4]);
        System.out.println(physicsGrades[5]);
 
 
 
        // We are calculating the sum of all physics grades
        double sumOfPhysicsGrades=0;
        for(int i=0;i<=physicsGrades.length-1;i++){
            sumOfPhysicsGrades = sumOfPhysicsGrades+physicsGrades[i];
        }
 
        // We are calculating the average of all physics grades
        double averagePhysicsGrade = sumOfPhysicsGrades / physicsGrades.length;
 
        // We are printing the sum and average of all physics grades with appropriate formatting
        System.out.printf("Sum: %.2f\nAverage: %.2f", sumOfPhysicsGrades, averagePhysicsGrade);
 
    }
}