import java.util.*;
class UserInterface {
 public static void main (String[] args) {
 Scanner s = new Scanner(System.in);

 String country[];
 int population[];

 System.out.println("Enter the total number of countries that need to be added to the array");

 int n = s.nextInt();

 country= new String[n];
 population = new int[n];
 s.nextLine();

 System.out.println("Enter the names of the countries ");

 for (int i = 0; i < n ; i++) {
 country[i] = s.nextLine();
 }

 System.out.println("Enter the population of each country in the same array-order as the country names

 for(int i = 0; i < n; i++) {
 population[i] = s.nextInt();
 }

 for(int i = 0; i< n; i++) {
 for(int j = i; j < n; j++) {
 if(population[j] < population[i]) {

 //swap
 int temp= population[i];
 population[i] = population[j];
 population[j] = temp;

   String temps=country[i];
 country[i] = country[j];
 country[j] = temps;
 }
 }
 }


 for(int i = 0; i < n; i++){
 System.out.println(country[i]+"-"+population[i]);
 }
 }
}
