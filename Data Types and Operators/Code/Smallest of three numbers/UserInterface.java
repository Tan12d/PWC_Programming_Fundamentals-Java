import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in);
 //Fill your code here

 System.out.println("Enter the numbers");

 int a= sc.nextInt();
 int b= sc.nextInt();
 int c= sc.nextInt();

 int small= (a>b)?((b>c)?c:b):((a>c)?c:a);

 if(small==a && small==b && small==c)
 {
 System.out.println("All numbers are equal");
 }

 else
 {
 System.out.println("The smallest number is "+small);
 }
 }
}
