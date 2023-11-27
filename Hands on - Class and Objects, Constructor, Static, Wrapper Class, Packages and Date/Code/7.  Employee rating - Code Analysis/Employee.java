public class Employee{

 private String employeeId;
 private double salary;
 private String[] certification;
 private int rating;

 public Employee(String employeeId,double salary,String[] certification) {
 this.employeeId=employeeId;
 this.salary=salary;
 this.certification=certification;
 }

 public void findRating()
 {
 for(int i=0;i<certification.length;i++)
 {
 if(certification[i].contains("JAVA") || certification[i].contains("ORACLE") ||
 certification[i].contains("GCUX") || certification[i].contains("CCNA")||
 certification[i].contains("AWS"))

 rating++;
 }
 }

 public double calculateIncrement(){

 double increment=0;

 if(rating==1)
 increment=(0.02*salary);

 else if(rating==2)
 increment=(0.035*salary);

 else if(rating==3)
 increment=(0.05*salary);

  else if(rating==4)
 increment=(0.075*salary);

 else if(rating==5)
 increment=(0.1*salary);

 salary=salary+increment;

 return increment;
 }

 public double getSalary(){
 return salary;
 }
 public int getRating(){
 return rating;
 }
}
