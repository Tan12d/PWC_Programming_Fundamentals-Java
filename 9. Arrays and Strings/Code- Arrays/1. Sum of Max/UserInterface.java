import java.util.Scanner;
import java.util.Arrays;
public class UserInterface{

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 //Fill the code here
 System.out.println("Enter the array size");
 int array=sc.nextInt();

 if(array<=1)
 {
 System.out.println(array+" is an invalid array size");
 }

 else if(array%2!=0 && array!=0)
 {
 System.out.println(array+" is an odd number.Please enter even number");
 }

 else
 {
 int a[]=new int[array];

 System.out.println("Enter the number");
 for(int i=0;i<array;i++)
 {
 a[i]=sc.nextInt();
 }

 int size=a.length;
 Arrays.sort(a);

 int max[]= new int[size];
 int min[]=new int[size];

 for(int i=0;i<size;i++)
 {
max[i]=a[(size-1)-i];
 }

 for(int i=size-1;i>=0;i--)
 {
 min[i]=a[(size-1)-i];
 }

 int ans[]= new int[size];
 int t[]=new int[size];

 for(int k=0;k<size/2;k++)
 {
 ans[k]=max[k]+min[(size-1)-k];
 }

 for(int i=0;i<size;i++)
 {
 t[i]=ans[(size-1)-i];
 }

 System.out.println("The maximum number is "+t[size-1]);
 }

 }
}
