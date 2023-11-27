import java.util.*;
public class UserInterface {
 public static void main(String args[])
 {
 //fill the code here
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the number of teams");
 int num=sc.nextInt();

 if(num<2)
 {
 System.out.println(num+" is an invalid input");
 return;
 }

 sc.nextLine();

 String res="";
 double score =Double.MAX_VALUE;
 System.out.println("Enter the details");
 for(int i=0;i<num;i++)
 {
 String inp=sc.nextLine();
 String arr[]=inp.split(":");
 double a=Double.parseDouble(arr[1]);
 double b=Double.parseDouble(arr[2]);
 double c=Double.parseDouble(arr[3]);
 double d=Double.parseDouble(arr[4]);

 if(a<1 || b<1 || c<1 || d<1)
 {
 System.out.println("Invalid number");
 return;
 }

 double temp=a+b+c+d;

 if(temp<score)
 {

 score=temp;
 res=arr[0];
 }
 }

 System.out.printf("%s team wins the race in %.2f minutes",res,score);
 }
}
