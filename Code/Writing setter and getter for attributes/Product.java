public class Product
{
 //Attributes
 private int productId;
 private String productName;
 private float price;
 private char category;

 //Write the setter

 public void setProductId(int productId)
 {
 this.productId=productId;
 }

 public void setProductName(String productName)
 {
 this.productName=productName;
 }

 public void setPrice(float price)
 {
 this.price=price;
 }

 public void setCategory(char category)
 {
 this.category=category;
 }

 //Write the getter

 public int getProductId()
 {
return productId;
}

 public String getProductName()
 {
 return productName;
 }

 public float getPrice()
 {
 return price;
 }

 public char getCategory()
 {
 return category;
 }

}
