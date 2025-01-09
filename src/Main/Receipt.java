
package Main;
import Model.Passenger;
import Model.Ticket;

public class Receipt {
    
     
    public void printReceipt(){
        
        
    Ticket tic = new Ticket();
    Passenger pass = new Passenger();
    
        System.out.println("--- 00 Reciept 00 --- ");
        System.out.println("Passenger Details: \n");
        System.out.println("Name: "+pass.getFirstName()+" "+pass.getMiddleName()+" "+pass.getLastName());
        System.out.println("Date of Birth: "+pass.getBdate());
        System.out.println("Gender: "+pass.getGender());
        System.out.println("-----------------------");
        System.out.println("Flight Details: \n");
        System.out.println("Destination: "+tic.getDestination()+" - P"+tic.getTicket_price());
        System.out.println("Seat Type: "+tic.getSeat_type()+" - P"+tic.getSeat_price());
        System.out.println("Discount: "+tic.getPassenger_type()+" - P"+tic.getDiscount_price());
        System.out.println("Date: "+tic.getDeparture_date());
        System.out.println("Time of Depature: "+tic.getDeparture_time());
        System.out.println("Quantity of Tickets: "+tic.getTicket_quantity());
        System.out.println("-----------------------");  
              
    }
    
   public void TicketDetail(){
   
               
    Ticket tic = new Ticket();
    Passenger pass = new Passenger();
    
        System.out.println("--- 00 Ticket Details 00 --- ");
        System.out.println("\nPassenger Details: \n");
        System.out.println("Name: "+pass.getFirstName()+" "+pass.getMiddleName()+" "+pass.getLastName());
        System.out.println("Date of Birth: "+pass.getBdate());
        System.out.println("Gender: "+pass.getGender());
        System.out.println("-----------------------");
        System.out.println("\n Flight Details: \n");
        System.out.println("Destination: "+tic.getDestination());
        System.out.println("Seat Type: "+tic.getSeat_type());
        System.out.println("Discount: "+tic.getPassenger_type());
        System.out.println("Date: "+tic.getDeparture_date());
        System.out.println("Time of Depature: "+tic.getDeparture_time());
        System.out.println("Quantity of Tickets: "+tic.getTicket_quantity());
        System.out.println("-----------------------");  
   
   } 
}
