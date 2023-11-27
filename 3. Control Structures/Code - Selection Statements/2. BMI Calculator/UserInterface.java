import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 //Fill the code here

 System.out.println("Enter weight in kg");
 double weight= sc.nextDouble();

 System.out.println("Enter height in cm");
 double height= sc.nextDouble();

 double BMI= weight/((height/100)*(height/100));

 double reduce=0,reduce1=0;

 System.out.printf("Your BMI is %.2f. ",BMI);

 if(BMI>=25)
 {
 System.out.println("You are overweight");
 reduce= BMI-25;
 System.out.printf("Reduce %.2f kg to be fit",reduce);
 }

 else if(BMI<25 && BMI>=18.5)
 {
 System.out.println("You are fit and healthy");
 }

 else if(BMI<18.5)
 {
 System.out.println("You are underweight");
 reduce1= 18.5-BMI;
 System.out.printf("Gain %.2f kg to be fit",reduce1);
 }
 }
}
