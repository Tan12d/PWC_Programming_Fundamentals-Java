import java.util.Scanner;
public class UserInterface
{
 public static void main(String args[])
 {

 Scanner sc =new Scanner(System.in);
 //Fill the code

 System.out.println("Enter the sentence");
 String s1=sc.nextLine();
 System.out.println("Enter the word");
 String s2=sc.next();

 for(int i=0;i<s1.length()-s2.length()+1;i++)
 {
 String temp=s1.substring(i,i+s2.length());

 if(temp.equals(s2))
 {
 System.out.println(s2+" is present in the sentence");
 return;
 }
 }

 System.out.println(s2+" is not present in the sentence");
 }

} 
