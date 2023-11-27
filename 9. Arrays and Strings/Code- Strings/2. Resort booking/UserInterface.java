import java.util.*;
public class UserInterface {

 public static void main(String args[])
 {
 //fill the code here
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the customer details");
 String customerDetails=sc.next();
 String custdetail[]= customerDetails.split(":");
 String customerName=custdetail[0];
 int adult=Integer.parseInt(custdetail[1]);
 int children=Integer.parseInt(custdetail[2]);
 int days=Integer.parseInt(custdetail[3]);

 if(adult<0)
 {
 System.out.println("Invalid input for number of adults");
 return;
 }

 if(children<0)
 {
 System.out.println("Invalid input for number of children");
 return;
 }

 if(days<=0)
 {
 System.out.println("Invalid input for number of days");
 return;
 }

 int totalCost= (adult*1000+children*650)*days;
 System.out.println(customerName+" your booking is confirmed and the total cost is "+totalCost);
 }
}
