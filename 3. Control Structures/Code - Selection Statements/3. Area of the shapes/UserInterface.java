import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 //Fill the code here

 System.out.println("Enter the sides");
 int side=sc.nextInt();


 double area=0;

 if(side==0)
 {
 System.out.println("Enter the radius");
 double radius= sc.nextDouble();

 area= 3.14*radius*radius;

 System.out.printf("Area of the Circle is %.2f",area);
 }

 else if(side==3)
 {
 System.out.println("Enter the base and height");
 double base= sc.nextDouble();
 double height= sc.nextDouble();

 area= (base*height)/2;

 System.out.printf("Area of the Triangle is %.2f",area);

 }

 else if(side==4)
 {
 System.out.println("Enter the length");
   double length= sc.nextDouble();
 double breadth= sc.nextDouble();

 if(length==breadth)
 {
 area= length*length;

 System.out.printf("Area of the Square is %.2f",area);
 }

 else
 {
 area= length*breadth;

 System.out.printf("Area of the Rectangle is %.2f",area);
 }
 }

 else
 {
 System.out.println("Invalid side");
 }
 }
}
