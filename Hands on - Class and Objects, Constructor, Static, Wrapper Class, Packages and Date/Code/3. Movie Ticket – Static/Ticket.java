public class Ticket
{
 // Fill the code
 private int ticketid;
 private int price;
 private static int availableTickets;

 public void setTicketid(int ticketid)
 {
 this.ticketid=ticketid;
 }

 public int getTicketid()
 {
 return ticketid;
 }

 public void setPrice(int price)
 {
 this.price=price;
 }

 public int getPrice()
 {
 return price;
 }

 public static void setAvailableTickets(int availableTickets)
 {
 Ticket.availableTickets=availableTickets;
 }

 public static int getAvailableTickets()
 {
 return availableTickets;
 }

public int calculateTicketCost(int nooftickets)
  {
 // Fill the code
 if(nooftickets<=0)
 {
 return -1;
 }

 if(availableTickets>=nooftickets)
 {
 availableTickets-=nooftickets;
 return price*nooftickets;
 }

 else
 {
 return -1;
 }
 }
}
