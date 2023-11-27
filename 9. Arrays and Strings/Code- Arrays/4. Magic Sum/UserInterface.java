import java.util.Scanner;
public class UserInterface{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);

 // Fill the code
 System.out.println("Enter the array size");
 int size=sc.nextInt();

 if(size<1 || size>5)
 {
 System.out.println(size+" is an invalid array size");
 return;
 }

 int arr[]=new int[size];

 boolean cp=false;

 System.out.println("Enter the numbers");
 for(int i=0;i<size;i++)
 {
 arr[i]=sc.nextInt();

 if(arr[i]<=0 || arr[i]>=100)
 {
 System.out.println(arr[i]+" is an invalid input");
 return;
 }

 if(isp(arr[i]) && sump(arr[i]))
 {
 cp=true;
 }
 }

 if(!cp)
   {
 System.out.println("The "+size+" numbers are not sum of prime numbers");
 }

 else{
 System.out.println("The sum of prime numbers is");
 for(int i=0;i<size;i++)
 {
 if(isp(arr[i]) && sump(arr[i]))
 System.out.println(arr[i]);
 }
 }
 }

 public static boolean sump(int n)
 {
 int sum=0;
 for(int i=2;i<n;i++)
 {
 if(isp(i))
 {
 sum+=i;
 }

 if(sum==n)
 {
 return true;
 }
 }

 if(sum>n || sum<n)
 return false;

 return true;
 }

 public static boolean isp(int n)
 {
 for(int i=2;i<=n/2;i++)
 {
if(n%i==0)
 return false;

 }

 return true;
 }
}
