import java.util.Scanner;
public class UserInterface{
 public static void main (String[] args) {
 Scanner s=new Scanner(System.in);

 System.out.println("Enter the employee id:");
 String id=s.nextLine();

 System.out.println("Enter the salary:");
 double sal=s.nextDouble();

 System.out.println("Enter the no of certification complete:");
 int n=s.nextInt();

 System.out.println("Enter the certification names:");
 String[] st=new String[n];

 for(int i=0;i<n;i++){
 st[i]=s.next();
 }

 Employee e=new Employee(id,sal,st);

 e.findRating();
 System.out.println("Your rating is "+e.getRating());
 System.out.print("Increment amount is ");
 System.out.format("%.2f",e.calculateIncrement());
 System.out.println();
 System.out.print("Current salary ");
 System.out.format("%.2f",e.getSalary());
 }
}
