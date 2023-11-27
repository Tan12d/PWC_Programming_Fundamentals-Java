import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 //fill the code here

 System.out.println("Enter the first string");
 String s1=sc.nextLine();
 System.out.println("Enter the second string");
 String s2=sc.nextLine();
 if(s1.length()!=s2.length())
 {
 System.out.println("Length of the strings "+s1+" and "+s2+" does not match");
 return;
 }

 if(!valid(s1) && !valid(s2))
 {
 System.out.println(s1+" and "+s2+" contains invalid symbols");
 return;
 }

 if(!valid(s1))
 {
 System.out.println(s1+" contains invalid symbols");
 return;
 }

 if(!valid(s2))
 {
 System.out.println(s2+" contains invalid symbols");
 return;
 }

 String res="";

 for(int i=0;i<s1.length();i++)
 {
 if(s1.charAt(i)!='!')
 {
 res+=s1.charAt(i);
}

 else
 {
 res+=s2.charAt(i);
 }
 }
 System.out.println(res);
 }

 public static boolean valid(String str)
 {
 for(int i=0;i<str.length();i++)
 {
 char c=str.charAt(i);

 if((c>=65 && c<=90) || (c>=97 && c<=122) || (c=='!') ||(c==' '))
 continue;
 else
 return false;
 }

 return true;
 }
}
