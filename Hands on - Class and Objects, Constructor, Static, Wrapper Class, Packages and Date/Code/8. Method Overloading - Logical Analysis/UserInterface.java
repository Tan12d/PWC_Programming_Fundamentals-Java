import java.util.Scanner;
public class UserInterface{
 //Implement the calculateArea methods
 public float calculateArea(float side)
 {
 return side*side;
 }

 public float calculateArea(float length,float breadth)
 {
 return length*breadth;
 }

 public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter value1");
 float value1=sc.nextFloat();
 System.out.println("Enter value2");
 float value2=sc.nextFloat();

 UserInterface m = new UserInterface();
 //Invoke the calculateArea method here
 System.out.println("Area of square "+m.calculateArea(value1));
 if(value1!=value2)
 System.out.println("Area of rectangle "+m.calculateArea(value1,value2));
 }
}
