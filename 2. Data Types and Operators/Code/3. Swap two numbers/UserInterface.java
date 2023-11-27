import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in);
 //Fill your code here

 System.out.println("Enter the numbers");

 int a=sc.nextInt();
 int b=sc.nextInt();

 System.out.println("Before swapping");
 System.out.println("first = "+a+", second = "+b);

 a= a^b;
 b= a^b;
 a= a^b;

 System.out.println("After swapping");
 System.out.println("first = "+a+", second = "+b);


 }
}
