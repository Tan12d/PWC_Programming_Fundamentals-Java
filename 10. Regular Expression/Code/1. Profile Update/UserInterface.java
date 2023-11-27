import java.util.Scanner;
import java.util.regex.*;
public class UserInterface
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 //Fill code here

 System.out.println("Enter your name");
 String a=sc.next();

 System.out.println("Enter your PAN number");
 String s=sc.next();

 String p="[A-Z]{5}[0-9]{4}[A-z]";

 if(Pattern.matches(p,s))
 {
 System.out.println("Enter your E-mail Id");
 String S=sc.next();
 String P="[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";
 String q=S.substring((S.length()-11));

 if(Pattern.matches(P,S) && q.equals("digitec.com"))
 {
 System.out.println("Profile of "+a+" updated successfully");
 }

 else
 {
 System.out.println("Invalid E-mail Id");
 }
 }

 else
 {
 System.out.println(s+" is an invalid PAN number");
 }
 }
}
