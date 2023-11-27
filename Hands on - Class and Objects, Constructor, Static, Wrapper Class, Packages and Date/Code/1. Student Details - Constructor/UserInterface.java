import java.util.Scanner;
public class UserInterface {

 public static void main(String[] arg)
 {
 // Fill the code
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter Student's Id:");
 int studentId= sc.nextInt();

 System.out.println("Enter Student's Name:");
 String studentName= sc.next();

 System.out.println("Enter Student's address:");
 String studentAddress= sc.next();

 String collegeName;

 while(true)
 {
 System.out.println("Whether the student is from NIT(Yes/No):");
 String choice= sc.next().toLowerCase();

 if(choice.equals("yes"))
 {
 collegeName="NIT";
 break;
 }

 else if(choice.equals("no"))
 {
 System.out.println("Enter the college name:");
 collegeName=sc.next();
 break;
 }

else
{
 System.out.println("Wrong Input");
 }
 }

 Student student;

 if(collegeName.equals("NIT"))
 {
 student= new Student(studentId,studentName,studentAddress);
 }

 else
 {
 student= new Student(studentId,studentName,studentAddress,collegeName);
 }

 System.out.println("Student id:"+student.getStudentId());
 System.out.println("Student name:"+student.getStudentName());
 System.out.println("Address:"+student.getStudentAddress());
 System.out.println("College name:"+student.getCollegeName());
 }
}
