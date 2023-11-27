public class Student {

 // Fill the code

 private int studentId;
 private String studentName;
 private String studentAddress;
 private String collegeName;

 private void setStudentId(int studentId)
 {
 this.studentId=studentId;
 }

 public int getStudentId()
 {
 return studentId;
 }

 public void setStudentName(String studentName)
 {
 this.studentName=studentName;
 }

 public String getStudentName()
 {
 return studentName;
 }

 public void setStudentAddress(String studentAddress)
 {
 this.studentAddress=studentAddress;
 }

 public String getStudentAddress()
 {
 return studentAddress;
 }

 public void setCollegeName(String collegeName)
 {
 this.collegeName=collegeName;
 }

 public String getCollegeName()
 {
 return collegeName;
 }

 public Student(int studentId, String studentName, String studentAddress, String collegeName)
 {
 this.studentId=studentId;
 this.studentName=studentName;
 this.studentAddress=studentAddress;
 this.collegeName=collegeName;
 }

 public Student(int studentId, String studentName, String studentAddress)
 {
 this.studentId=studentId;
 this.studentName=studentName;
 this.studentAddress=studentAddress;
 this.collegeName="NIT";
 }
}
