import java.util.Scanner;
public class UserInterface
{
 public static void main(String args[])
 {

 Scanner sc =new Scanner(System.in);
 //Fill the code
 System.out.println("Enter the details");
 String inp=sc.nextLine();
 String str[]=inp.split(":");
 int age=Integer.parseInt(str[1]);
 int big=Integer.parseInt(str[2]);
 int mid=Integer.parseInt(str[3]);
 int small=Integer.parseInt(str[4]);

 if(age<18)
 {
 System.out.println(age+" is an invalid age");
 return;
 }

 if(big<0)
 {
 System.out.println(big+" is an invalid input");
 return;
 }

 if(mid<0)
 {
 System.out.println(mid+" is an invalid input");
 return;
 }

 if(small<0)
 {
 System.out.println(small+" is an invalid input");
 return;
 }

  int res=(big*10+mid*6+small*3);
 System.out.println(str[0]+" scored "+res+" points");
 }
}
