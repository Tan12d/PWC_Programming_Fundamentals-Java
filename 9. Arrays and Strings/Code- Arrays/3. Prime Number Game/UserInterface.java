import java.util.Scanner;
public class UserInterface {
 public static void main(String[]args)
 {
 Scanner sc=new Scanner(System.in);
 //Fill the code here

 System.out.println("Enter the size of first array");
 int s1=sc.nextInt();

 if(s1>0)
 {
 int arr1[]=new int[s1];
 boolean is=true;
 System.out.println("Enter the array elements");
 for(int i=0;i<s1;i++)
 {
 arr1[i]=sc.nextInt();
 if(arr1[i]<0)
 {
 System.out.println(arr1[i]+" is an invalid input");
 is=false;
 break;
 }
 }

 if(is)
 {
 System.out.println("Enter the size of second array");
 int s2=sc.nextInt();

 if(s1==s2)
 {
 int arr2[]=new int[s2];
 is=true;
 System.out.println("Enter the array elements");
 for(int i=0;i<s2;i++)
 {
 arr2[i]=sc.nextInt();
 if(arr2[i]<0)
{
 System.out.println(arr2[i]+" is an invalid input");
 is=false;
 break;
 }
 }

 if(is)
 {
 int arr3[]=new int[s1];
 int sum=0;

 for(int i=0;i<s1;i++)
 {
 arr3[i]=arr1[i]+arr2[i];
 sum+=arr3[i]%10;
 }

 boolean isp=true;

 for(int i=2;i<=sum/2;i++)
 {
 if(sum%i==0)
 {
 isp=false;
 break;
 }
 }

 if(isp)
 System.out.println(sum+" is a prime number");

 else
 System.out.println(sum+" is not a prime number");

 }
 }

 else{
 if(s2<=0)
System out println(s2+" is an invalid array size");
   else
 {
 System.out.println("Both array size is different");
 }
 }
 }
 }


 else{
 System.out.println(s1+" is an invalid array size");
 }
 }
}
