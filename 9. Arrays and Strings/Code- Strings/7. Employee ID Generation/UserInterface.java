import java.util.Scanner;
public class UserInterface
{
 public static void main(String args[])
 {

 Scanner sc =new Scanner(System.in);
 //Fill the code
 System.out.println("Enter the training id");
 String inp=sc.nextLine();

 if(inp.length()!=9)
 {
 System.out.println(inp+ " is an invalid training id");
 return;
 }

 int year=Integer.parseInt(inp.substring(0,4));
 String code =inp.substring(4,6);
 String roll= inp.substring(6,9);

 if(year!=2021)
 {
 System.out.println(year+" is an invalid year");
 return;
 }

 char a=inp.charAt(4);
 char b=inp.charAt(5);

 if(a!='0' || (b!='1' && b!='2' && b!='3' && b!='4' && b!='5'))
 {
 System.out.println(code+" is an invalid team code");
 return;
 }

 char d1=inp.charAt(8),d2=inp.charAt(7),d3=inp.charAt(6);

 if(d1=='0' && d2=='0' && d3=='0')
 {
System.out.println(roll+" is an invalid roll number");
 return;
 }

 String res="SIET";
 switch(b)
 {
 case '1':
 res+="LP";
 break;

 case '2':
 res+="TA";
 break;

 case '3':
 res+="CT";
 break;

 case '4':
 res+="PT";
 break;

 case '5':
 res+="TT";
 break;
 }
 res+=roll;
 System.out.println("Employee Id: "+res);

 return;
 }

}
