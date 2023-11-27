import java.util.Scanner;
public class UserInterface{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);

 // Fill the code
 System.out.println("Enter the total number of PIN numbers");
 int num=sc.nextInt();

 if(num<=0)
 {
 System.out.println(num+" is an invalid number");
 return;
 }

 int arr[]=new int[num];
 System.out.println("Enter the PIN numbers");
 for(int i=0;i<num;i++)
 {
 arr[i]=sc.nextInt();
 if(String.valueOf(arr[i]).length()!=4)
 {
 System.out.println(arr[i]+" is an invalid PIN number");
 return;
 }
 }

 int count=0;
 for(int i=0;i<num;i++)
 {
 int temp=arr[i];
 int ones=temp%10;
 temp/=10;
 int tens=temp%10;
 temp/=10;
 int hund=temp%10;
 temp/=10;
   if(temp%2==1 && hund%2==0 && isp(tens) && !isp(ones))
 count++;
 }

 if(count==0)
 {
 System.out.println("All these "+num+" numbers are not a valid PIN number");
 }

 else
 {
 System.out.println("Valid PIN numbers are");

 for(int i=0;i<num;i++)
 {
 int temp=arr[i];
 int ones=temp%10;
 temp/=10;
 int tens=temp%10;
 temp/=10;
 int hund=temp%10;
 temp/=10;

 if(temp%2==1 && hund%2==0 && isp(tens) && !isp(ones))
 System.out.println(arr[i]);
 }
 }

 }

 public static boolean isp(int n)
 {
 if(n==1)
 {
 return false;
 }

 for(int i=2;i<=n/2;i++)
 {
 if(n%i==0)
{
  return false;
 }
 }
 return true;
 }
}
