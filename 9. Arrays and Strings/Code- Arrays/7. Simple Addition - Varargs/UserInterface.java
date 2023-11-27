import java.util.Scanner;
public class UserInterface
{
 public static void main(String args[])
 {
 Scanner sc =new Scanner(System.in);

 //Call the addition method with two arguments 10,15

 int x=addition(new int[]{10,15});
 System.out.println("Total "+x);

 //Call the addition method with three arguments 10,20,30

 int y=addition(new int[]{10,20,30});
 System.out.println("Total "+y);

 //Call the addition method with six arguments 10,30,60,100,5,15

 int z=addition(new int[]{10,30,60,100,5,15});
 System.out.println("Total "+z);

 }


 //Include the public static int addition(int... a) method
 public static int addition(int... a)
 {
 int sum=0;
 for(int i=0;i<a.length;i++)
 {
 sum+=a[i];
 }

 System.out.println("Number of arguments is "+a.length);
 return sum;
 }
}
