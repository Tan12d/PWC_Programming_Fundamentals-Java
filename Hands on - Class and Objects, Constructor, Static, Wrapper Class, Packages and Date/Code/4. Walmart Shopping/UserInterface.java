import java.util.Scanner;
public class UserInterface
{
 public static void main(String args[])
 {
 Scanner sc =new Scanner(System.in);
 //Fill the code

 System.out.println("Enter the Name");
 String name=sc.nextLine();

 System.out.println("Enter the Barcode");
 long barcode= sc.nextLong();



 System.out.println("Enter the Product Type");
 String productType= sc.next();

 if(productType.equals("ElectricalItems") || productType.equals("Grocery") || productType.equals("Garm
 {
 System.out.println("Enter the Product Name");
 String productName=sc.next();
 System.out.println("Enter the price of the item");
 double price=sc.nextDouble();

 Walmart ww=new Walmart(name,barcode,productType,productName);
 double cost=ww.calculateTotalBill(price);

 System.out.println("Name : "+ww.getName());
 System.out.println("Barcode : "+ww.getBarcode());
 System.out.println("Product Type : "+ww.getProductType());
 System.out.println("Product Name : "+ww.getProductName());
 System.out.printf("Bill Amount : %.1f",cost);
 }
else
   {
 System.out.println("Invalid Product Type");
 }
 }
}
