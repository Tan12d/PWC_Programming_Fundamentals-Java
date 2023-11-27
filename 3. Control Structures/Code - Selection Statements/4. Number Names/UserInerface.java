import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 //Fill the code here

 System.out.println("Enter the number");
 int num= sc.nextInt();

 String s=Integer.toString(num);

 if(s.charAt(0)!='0')
 {
 for(int i=0;i<s.length();i++)
 {
 if(s.charAt(i)=='0')
 {
 System.out.print("zero"+" ");
 }

 else if(s.charAt(i)=='1')
 {
 System.out.print("one"+" ");
 }

 else if(s.charAt(i)=='2')
 {
 System.out.print("two"+" ");
 }

 else if(s.charAt(i)=='3')
 {
 System.out.print("three"+" ");
 }

 else if(s.charAt(i)=='4')
 {
   System.out.print("four"+" ");
 }

 else if(s.charAt(i)=='5')
 {
 System.out.print("five"+" ");
 }

 else if(s.charAt(i)=='6')
 {
 System.out.print("six"+" ");
 }

 else if(s.charAt(i)=='7')
 {
 System.out.print("seven"+" ");
 }

 else if(s.charAt(i)=='8')
 {
 System.out.print("eight"+" ");
 }

 else if(s.charAt(i)=='9')
 {
 System.out.print("nine"+" ");
 }
 }
 }
 }
}
