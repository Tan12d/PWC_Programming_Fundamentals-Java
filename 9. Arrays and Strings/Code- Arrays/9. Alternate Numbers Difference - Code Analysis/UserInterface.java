import java.util.*;
public class UserInterface{
 public static void main (String[] args) {
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the size of the array");

 int size = sc.nextInt();
 if(size <= 3){
 System.out.println("Invalid array size");
 }
 else{

 System.out.println("Enter the inputs");

 int arr[]= new int[size];
 int diff = 0;
 int small_index=0;
 for(int i = 0; i < size; i++)
 arr[i] = sc.nextInt();
 for(int j = 0; j < size - 2; j++){
 if(Math.abs(arr[j] - arr[j+2]) > diff){
 diff = Math.abs(arr[j] - arr[j+2]);
 if(arr[j] <= arr[j+2])
 small_index = j;
 else
 small_index = j + 2;
 }
 }
 System.out.println(small_index);
 }

 }
}
