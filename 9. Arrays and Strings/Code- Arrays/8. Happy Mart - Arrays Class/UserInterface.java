import java.util.Scanner;
import java.util.*;
public class UserInterface {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 // Fill the code here
 System.out.println("Enter the products count");
 int n=sc.nextInt();

 if(n<=0)
 {
 System.out.println("Invalid count");
 return;
 }

 Product pr[]=new Product[n];
 System.out.println("Enter Product details");
 for(int i=0;i<n;i++)
 {
 String temp=sc.next();
 String str[]=temp.split(":");
 int id=Integer.parseInt(str[0]);
 String name=str[1];
 double price=Double.parseDouble(str[2]);
 pr[i]=new Product(id,name,price);
 }

 System.out.println("1.Sort By Id");
 System.out.println("2.Sort By Price");
 System.out.println("Enter your choice");

 int choice=sc.nextInt();

 if(choice==1)
{
System.out.println("After Sorting By Id");
 Arrays.sort(pr,new SortById());
 for(int i=0;i<n;i++)
 {
 System.out.println(pr[i].toString());
 }
 }

 else if(choice ==2 )
 {
 {
 System.out.println("After Sorting By Price");
 Arrays.sort(pr,new SortByPrice());
 for(int i=0;i<n;i++)
 {
 System.out.println(pr[i].toString());
 }
 }
 }

 else
 {
 System.out.println("Invalid choice");
 }
 }
}
