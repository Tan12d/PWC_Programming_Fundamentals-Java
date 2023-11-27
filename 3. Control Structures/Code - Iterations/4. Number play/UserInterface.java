import java.util.Scanner;
public class UserInterface{

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 int number;

 //Fill the code here
 System.out.println("Enter the number");
 number= sc.nextInt();

 int tensDigit=number/10;
 int onesDigit=number%10;
 int c=number;

 int count=0;

 while(c>0)
 {
 int i=c%10;
 c/=10;
 count++;
 }

 if(count==2)
 {
 if(number>50)
 {
 System.out.println(tensDigit-onesDigit);
 }

 else
 {
 int reverse=0;

 while(number!=0)
 {
int digit= number%10;
 reverse= (reverse*10)+digit;
 number/=10;
 }

 int tens= reverse/10;
 int ones= reverse%10;

 System.out.println(tens-ones);
 }
 }

 else
 {
 System.out.println("Invalid number");
 }


 }
}
