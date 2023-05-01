public class Program21PracticeMethods {
    public static double calculatePerimeter(double height, double width){
        return 2*(height+width);
    }
 
    public static double calculateArea(double height, double width){
        double result=height*width;
        return result;
    }
 
    public static String sayHello(String name){
        return "Hello "+name;
    }
 
    public static String introduce(String name, int age, String country){
        return String.format("My name is %s, i'm %d years old, and i'm from %s",name,age,country);
    }
    public static void main(String[] args) {
 
    }
}