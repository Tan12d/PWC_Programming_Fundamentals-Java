import java.util.Scanner;
import java.util.*;
public class UserInterface
{
 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 //Fill the code here

 System.out.println("Enter the first array size");
 int size=sc.nextInt();

 if(size>0)
 {
 int arr1[]=new int[size];

 System.out.println("Enter the numbers");
 for(int i=0;i<size;i++)
 {
 arr1[i]=sc.nextInt();
 }

 System.out.println("Enter the second array size");
 int size1=sc.nextInt();

 if(size1>0 && size1<=size)
 {
 int arr2[]=new int[size1];

 System.out.println("Enter the numbers");
 for(int i=0;i<size1;i++)
 {
 arr2[i]=sc.nextInt();
 }

 Arrays.sort(arr1);
 Arrays.sort(arr2);

 int j=0,k=0;
while(j<size1 && k<size)
 {
 if(arr2[j]==arr1[k])
 {
 j++;
 k++;
 }

 else
 {
 k++;
 }
 }

 if(j==size1)
 {
 System.out.println("Array2 of size "+size1+" is a subset of array1");
 }

 else
 {
 System.out.println("Array2 of size "+size1+" is not a subset of array1");
 }
 }

 else
 {
 if(size1<=0)
 {
 System.out.println(size1+" is an invalid array size");
 }

 else if(size1>size)
 {
 System.out.println(size1+" is an invalid size as it is greater than first array size "+si
 }
 }
 }

 else
 {
   System.out.println(size+" is an invalid array size");
 }
 }
}
