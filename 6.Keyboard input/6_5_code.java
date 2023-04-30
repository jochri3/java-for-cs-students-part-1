Scanner input=new Scanner(System.in);
 
// Will throw an error because a string cannot be assigned to an int
//int myNumber="45";
 
// When the code above is updated with Integer.parseInt("45") the string "45" is converted to an valide int
//int myNumber=Integer.parseInt("45");
 
 
int myNumber= input.nextInt();
int myNumber2=input.nextInt();
System.out.println(myNumber);
System.out.println(myNumber2);