   // v1
   
   public static void main(String[] args) {
        double height=500;
        double width=250;
 
        System.out.println(calculatePerimeter(height,width));
        System.out.println(calculateArea(height,width));
        
        System.out.println(sayHello("Chris"));
        System.out.println(introduce("Chris",21,"DR Congo"));
    }

    //v2

    public static void main(String[] args) {
    double height=500;
    double width=250;
 
    double perimeter=calculatePerimeter(height,width);
    double area=calculateArea(height,width);
 
    System.out.println("Perimeter : "+perimeter);
    System.out.println("Area : "+area);
 
    System.out.println(sayHello("Chris"));
    System.out.println(introduce("Chris",21,"DR Congo"));
}
