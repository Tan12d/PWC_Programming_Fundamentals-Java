import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class UserInterface {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 //FILL THE CODE
 System.out.println("Enter the date:");
 String userInput=sc.nextLine();
 SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
 dateFormat.setLenient(false);

 try
 {
 dateFormat.parse(userInput);
 System.out.println(userInput+" is a valid date");
 }

 catch(Exception e)
 {
 System.out.println(userInput+" is not a valid date");
 }
 }
}
