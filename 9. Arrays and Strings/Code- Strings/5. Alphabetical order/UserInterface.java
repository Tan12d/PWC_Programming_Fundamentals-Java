import java.util.Scanner;
import java.util.*;
public class UserInterface
{
 public static void main(String[] args)
 {

 Scanner sc=new Scanner(System.in);

 //Fill the code here
 System.out.println("Enter the sentence");
 String input=sc.nextLine();
 if(!valid(input))
 {
 System.out.println(input+" is an invalid input");
 return;
 }

 String arr[]=input.split(" ");
 for(int i=0;i<arr.length;i++)
 {
 char ch[]=arr[i].toCharArray();
 Arrays.sort(ch);
 arr[i]=String.valueOf(ch);
 }

 String res="";
 for(int i=0;i<arr.length;i++)
 {
 res+=arr[i];
 res+=" ";
 }

 res=res.trim();
 System.out.println(res);

 }
 public static boolean valid(String str)
 {
for(int i=0;i<str.length();i++)
 {
 char c=str.charAt(i);
 if((c>=65 && c<=90) || (c>=97 && c<=122) || (c==' '))
 {
 continue;
 }

 else
 return false;
 }

 return true;


 }
}
