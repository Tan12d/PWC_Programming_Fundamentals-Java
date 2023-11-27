import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserInterface {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 //FILL THE CODE
 System.out.println("Enter the Manufacturing Date");
 String manufacturingDate = sc.next();

 if(isValidDate(manufacturingDate))
 {
 System.out.println("Enter the Month");
 int month= sc.nextInt();

 SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
 dateFormat.setLenient(false);

 try
 {
 Date dd1= dateFormat.parse(manufacturingDate);

 Calendar c=Calendar.getInstance();
 c.setTime(dd1);
 c.add(c.MONTH, month);

 Date dd=c.getTime();
 String exprDate= dateFormat.format(dd);

 System.out.println(exprDate+" is the expiry date");
}

 catch(ParseException e)
 {
 System.out.println(manufacturingDate+" is not a valid date");
 }
 }


 else
 {
 System.out.println(manufacturingDate+" is not a valid date");
 }

 }

 public static boolean isValidDate(String date)
 {
 SimpleDateFormat t=new SimpleDateFormat("dd/MM/yyyy");
 t.setLenient(false);

 try
 {
 Date d=t.parse(date);
 return d!=null;
 }

 catch(Exception e)
 {
 return false;
 }
 }
}

   
