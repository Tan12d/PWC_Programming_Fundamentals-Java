import java.util.*;
public class UserInterface{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 //FILL CODE HERE

 System.out.println("Enter the word");
 String inputStr=sc.next();
 int a=inputStr.length();
 System.out.println("Enter the two indices");
 int input1=sc.nextInt();

 if(input1<a)
 {
 int input2=sc.nextInt();
 if(input2<a)
 {
 if(input1<input2)
 {
 String result=inputStr.substring(input1,input2);
 System.out.println(result);
 }

 else
 {
 System.out.println("Index2 should be greater than Index1");
 }
 }

 else
 {
 System.out.println(input2+" is greater than the word length");
 }
 }

 else
 {
 System.out.println(input1+" is greater than the word length");
 }
 }
}
