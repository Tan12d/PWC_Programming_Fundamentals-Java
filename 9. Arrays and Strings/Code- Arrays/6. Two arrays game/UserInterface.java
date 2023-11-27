import java.util.Scanner;
public class UserInterface{

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 //Fill the code here
 System.out.println("Enter the size for the first array");
 int s1=sc.nextInt();

 if(s1<=0)
 {
 System.out.println(s1+" is an invalid array size");
 return;
 }

 int arr1[]=new int[s1];
 System.out.println("Enter the elements for the first array");
 for(int i=0;i<s1;i++)
 {
 arr1[i]=sc.nextInt();
 }
 System.out.println("Enter the size for the second array");
 int s2=sc.nextInt();

 if(s2<=0)
 {
 System.out.println(s2+" is an invalid array size");
 return;
 }

 if(s1!=s2)
 {
 System.out.println("Both array sizes are not the same");
 return;
 }

 int arr2[]=new int[s2];

  System.out.println("Enter the elements for the second array");

 for(int i=0;i<s2;i++)
 {
 arr2[i]=sc.nextInt();
 }

 int arr3[]=new int[s1];

 for(int i=0;i<s1;i++)
 {
 if(i%2==0)
 arr3[i]=arr1[i]+arr2[i];
 else
 arr3[i]=arr1[i]-arr2[i];
 }

 System.out.println("The elements of the third array");

 for(int i=0;i<s1;i++)
 {
 System.out.println(arr3[i]);
 }

 }
}
