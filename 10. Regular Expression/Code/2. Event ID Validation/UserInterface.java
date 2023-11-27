import java.util.Scanner;
public class UserInterface
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 //Fill code here

 System.out.println("Enter your name");
 String name=sc.next();

 System.out.println("Enter your ID");
 String id=sc.next();

 if(!isValid(id))
 {
 System.out.println(id+" is an Invalid ID");
 return;
 }

 int seat= Integer.parseInt(id.substring(3,6));
 int time= Integer.parseInt(id.substring(6,8));
 System.out.println("Hi "+name+" your seat number is "+seat+" and the event starts at "+time+""+id.sub
 }

 public static boolean isValid(String s)
 {
 if(s.length()!=10)
 {
 return false;
 }

 if(!s.substring(0,3).equals("SPC"))
 {
 return false;
 }

 if(!s.substring(3,6).matches("[0-9]{3}"))
 {
 return false;
}

 if(!s.substring(6).matches("[0-9]{2}[A-Z]{2}"))
 {
 return false;
 }

 if(!s.substring(8).equals("AM") && !s.substring(8).equals("PM"))
 {
 return false;
 }

 if((Integer.parseInt(s.substring(6,8))<1 || Integer.parseInt(s.substring(6,8))>12))
 {
 return false;
 }

 return true;
 }
}
