import java.util.Scanner;
public class UserInterface {

 public static void main(String[] arg)
 {
 // Fill the code
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter movie name");
 String name=sc.nextLine();

 System.out.println("Enter no of bookings");
 int num=sc.nextInt();

 System.out.println("Enter the available tickets");
 int numberOfTickets=sc.nextInt();



 for(int i=0;i<num;i++)
 {
 Ticket tt=new Ticket();

 System.out.println("Enter the ticketid");
 int ticketid=sc.nextInt();
 tt.setTicketid(ticketid);

 System.out.println("Enter the price");
 int price=sc.nextInt();
 tt.setPrice(price);

 System.out.println("Enter the no of tickets");
 int ticket=sc.nextInt();
 tt.setAvailableTickets(numberOfTickets);

 int cost=tt.calculateTicketCost(ticket);

numberOfTickets=tt.getAvailableTickets();

  if(cost==-1)
 {
 System.out.println("Available tickets: "+tt.getAvailableTickets());
 System.out.println("Tickets are not available");
 }

 else
 {
 System.out.println("Available tickets: "+(tt.getAvailableTickets()+ticket));
 System.out.println("Total amount: "+cost);

 if(tt.getAvailableTickets()!=0)
 {
 System.out.println("Available ticket after booking: "+tt.getAvailableTickets());
 }

 else
 {
 System.out.println("House full");
 break;
 }
 }

 }
 }
}
