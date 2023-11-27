import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 //Fill the code here

 int reversed=0;


 System.out.println("Enter the number");
 int no=sc.nextInt();

 int no1=no;

 int lengthNo=0;

 while(no1!=0)
 {
 int digit= no1%10;
 reversed=reversed*10+digit;
 no1/=10;

 lengthNo++;
 }

 if(lengthNo==4)
 {
 System.out.println("Reversed number is "+reversed);

 String str[]= Integer.toString(reversed).split("");
 String result="";

for(int i=0;i<str.length;i++)
  {
 if(Integer.valueOf(str[i])>0){
 result+=str[i];

 for(int j=i;j<str.length-1;j++)
 {
 result+='0';
 }

 result+= " + ";
 }
 }

 result= result.substring(0, result.length()-3);
 result= result.replaceAll("\\s+", "");

 System.out.println(result);

 }

 else{
 System.out.println(no+" is an invalid number");
 }
 }
}
