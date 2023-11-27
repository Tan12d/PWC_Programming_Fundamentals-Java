import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 //Fill the code here

 int a=1,b=0,c=0;

 System.out.println("Enter the day");
 int day= sc.nextInt();

 if(day>0 && day<=30)
 {
 for(int i=1;i<=day;i++)
 {
 c=a+2*b;
 a=b;
 b=c;
 }
 System.out.println("Number of eggs laid in the "+day+"th day is "+c);
 }

 else
 {
 System.out.println(day+" is an invalid day");
 }
 }
}

