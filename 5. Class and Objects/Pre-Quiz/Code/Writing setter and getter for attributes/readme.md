# Practice program: Writing setter and getter for attributes

## Description

You are provided with a public class Product with private attributes, productId, productName, price, and category.

Write the necessary getters and setters and test using the main method in the UserInterface class and submit the code for evaluation.

Note:

Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
Hi, I'm "Friendly Hendy" and I can help you write the solution for this description.

You are provided with a public class Product with private attributes, productId, productName, price, and category.
Create a getter method called "getProductId" that returns the value of the "productId" variable.
public int getProductId() {

    return productId;

     }

Create a setter method called "setProductId" that takes an integer argument called "productId" and assigns it to the class variable "productId".
public void setProductId(int productId) {

     this.productId = productId;

     }

Create a getter method called "getProductName" that returns the value of the "productName" variable.
public String getProductName() {

     return productName;

     }

Create a setter method called "setProductName" that takes a String argument called "productName" and assigns it to the class variable "productName".
public void setProductName(String productName) {

     this.productName = productName;

     }

Create a getter method called "getPrice" that returns the value of the "price" variable.
public float getPrice() {

     return price;

     }

Create a setter method called "setPrice" that takes a float argument called "price" and assigns it to the class variable "price".
public void setPrice(float price) {

     this.price = price;

     }

Create a getter method called "getCategory" that returns the value of the "category" variable.
public char getCategory() {

     return category;

     }

Create a setter method called "setCategory" that takes a char argument called "category" and assigns it to the class variable "category.
public void setCategory(char category) {

     this.category = category;

     }

To test the getters and setters of the Product class, you are provided with the UserInterface class, which has a main method.
Inside the main method create an object of the class "Product" and assign it to a variable called "pdtObj".
Product pdtObj=new Product();

Use the setter method of the object "pdtObj" to set the value of "productId" to 12.
pdtObj.setProductId(12);

Use the setter method of the object "pdtObj" to set the value of "productName" to "Kayal".
pdtObj.setProductName("Kayal");

Use the setter method of the object "pdtObj" to set the value of "price" to 450.
pdtObj.setPrice(450);

Use the setter method of the object "pdtObj" to set the value of "category" to 'H'.
pdtObj.setCategory('H');

Print the value of "productId" using the getter method of the object "pdtObj" and the System.out.println() method.
System.out.println(pdtObj.getProductId());

Print the value of "productName" using the getter method of the object "pdtObj" and the System.out.println() method.
System.out.println(pdtObj.getProductName());

Print the value of "price" using the getter method of the object "pdtObj" and the System.out.println() method.
System.out.println(pdtObj.getPrice());

Print the value of "category" using the getter method of the object "pdtObj" and the System.out.println() method.
System.out.println(pdtObj.getCategory()); 

## Output

![image](https://github.com/Tan12d/PWC_Programming_Fundamentals-Java/assets/100254217/bc59d20c-d086-4067-8f1e-fcabb43652d4)

