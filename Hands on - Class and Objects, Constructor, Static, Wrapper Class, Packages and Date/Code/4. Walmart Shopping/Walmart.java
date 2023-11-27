public class Walmart
{
 //Include Getters and Setters
 //Include four argument constructor
 //Include public double calculateTotalBill(double cost) method

 String name;
 long barcode;
 String productType;
 String productName;

 public void setName(String name)
 {
 this.name=name;
 }

 public void setBarcode(long barcode)
 {
 this.barcode=barcode;
 }

 public void setProductType(String productType)
 {
 this.productType=productType;
 }

 public void setProductName(String productName)
 {
 this.productName=productName;
 }

 public String getName()
 {
 return name;
 }

 public long getBarcode()
 {
 return barcode;
 }


 public String getProductType()
 {
 return productType;
 }
 public String getProductName()
 {
 return productName;
 }

 public Walmart(String name,long barcode,String productType,String productName)
 {
 this.name=name;
 this.barcode=barcode;
 this.productType=productType;
 this.productName=productName;
 }

 public double calculateTotalBill(double cost)
 {
 double res=0,tax=0;

 String ss=productType;
 if(ss.equals("ElectricalItems"))
 {
 tax=0.5;
 }

 else if(ss.equals("Grocery"))
 {
 tax=0.3;
   }

 else if(ss.equals("Garments"))
 {
 tax=0.6;
 }

 if(tax==0)
 return -1;
 return ((cost*tax)+cost);
}
}
