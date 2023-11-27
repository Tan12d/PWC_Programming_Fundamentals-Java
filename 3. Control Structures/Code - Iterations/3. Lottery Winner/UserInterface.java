import java.util.Scanner;
public class UserInterface
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 //Fill code here

 long ticketId;
 int unluckyCode;

 System.out.println("Enter the ticket Id");
 ticketId= sc.nextLong();

 System.out.println("Enter the unlucky code");
 unluckyCode= sc.nextInt();

 String s= String.valueOf(ticketId);

 char t= String.valueOf(unluckyCode).charAt(0);

 int count=0;

 for(int i=0;i<s.length();i++)
 {
 if(t==s.charAt(i))
 {
 count++;
 }
 }

 if(count==0)
 {
 System.out.println(ticketId+" is lucky ticket");
 }

 else if(count<3)
 {
 System.out.println(ticketId+" is partially lucky");
 }

 else
 {
 System.out.println(ticketId+" is unlucky ticket");
 }
 }
}
