import java.util.Scanner;
public class UserInterface
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 //Fill code here
 System.out.println("Generate your password");
 String s=sc.next();

 int arr[]=new int[4];

 if(isValid(s,arr))
 {
 System.out.println("The generated password "+s+" is valid and has "+arr[1]+" lowercase alphabet "
 }

 else
 {
 System.out.println(s+" is an invalid password");
 }
 }

 public static boolean isValid(String s,int arr[])
 {
 if(s.length()<6 || s.length()>12)
 {
 return false;
 }

 String ch[]={"@","$","*","#"};

 int upper=0,lower=0,special=0,digit=0;

 for(char c:s.toCharArray())
 {
 if(Character.isUpperCase(c))
 {
 upper++;
 }
else if(Character.isLowerCase(c))
 {
 lower++;
 }

 else if(c=='@'||c=='$'||c=='*'||c=='#')
 {
 special++;
 }

 if(Character.isDigit(c))
 {
 digit++;
 }
 }

 if(upper<1||lower<1||special<1)
 {
 return false;
 }

 if(s.contains(" "))
 {
 return false;
 }

 arr[0]=upper;
 arr[1]=lower;
 arr[2]=special;
 arr[3]=digit;
 return true;
 }
}
