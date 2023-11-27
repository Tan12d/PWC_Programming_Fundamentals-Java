public class UserInterface
{
 public static void main(String args[])
 {
 Product pdtObj=new Product();

 //Invoke the setters and getters

 pdtObj.setProductId(12);
 pdtObj.setProductName("Kayal");
 pdtObj.setPrice(450);
 pdtObj.setCategory('H');

 System.out.println(pdtObj.getProductId());
 System.out.println(pdtObj.getProductName());
 System.out.println(pdtObj.getPrice());
 System.out.println(pdtObj.getCategory());
 }
}
