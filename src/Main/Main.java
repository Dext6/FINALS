package Main;

import Model.Ticket;
import Model.Passenger;
import Interface.TicketActionImpl;
import Interface.TicketAction;
import static Main.Main.deleteBooking;
import java.util.List;
import java.util.Scanner;

public class Main {

        final static Scanner scan = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        int userTicketChoice;
        do{
         //select transaction
         System.out.println("\nWelcome to JCR Airline Ticket Booking");
         System.out.println("1. Book a Ticket");
         System.out.println("2. Update Booking");
         System.out.println("3. Delete Booking");
         System.out.println("4. View Booking");
         System.out.println("5. View All Booking");
         System.out.println("6. Exit");
             
         
         System.out.print("Select Transaction: ");
         userTicketChoice = scan.nextInt();
           
            switch(userTicketChoice){
                case 1:
                    requestBooking();
                    break;   
                case 2: 
                    updateBooking();
                    break;
                case 3:
                    deleteBooking();
                    break;
                case 4:
                    viewSpecificBook();
                    scan.nextLine();
                    break;
                case 5:
                    viewAllBooking();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("ERROR: INVALID CHOICE");
                    
            }
         }while(userTicketChoice != 6);
    }
    
   
    private static void requestBooking() {
            
           while(true){
            Ticket reqBook = new Ticket();
            Passenger pass = new Passenger();
            
            //enter passenger details
            scan.nextLine();
            System.out.println("\nEnter Passenger Details");
            System.out.println("First Name: ");
            pass.setFirstName(scan.nextLine());
            System.out.println("Middle Name: ");
            pass.setMiddleName(scan.nextLine());
            System.out.println("Last Name: ");
            pass.setLastName(scan.nextLine());
            System.out.println("Birth Date: ");
            pass.setBdate(scan.nextLine());
            System.out.println("Gender (F/M): ");
            pass.setGender(scan.nextLine());
            
            
            
            //select a destination
            System.out.println("\nAvailable Destinations");
            System.out.println("1. Dumaguete to Cebu - 1500");
            System.out.println("2. Dumaguete to Dipolog - 3000");
            System.out.println("3. Dumaguete to Palawan - 3500");
            System.out.println("4. DumaguetDumaguetee to Siargao - 4000");
            System.out.println("5. Dumaguete to Manila - 5000");
            
            System.out.println("\nSelect a Destination:");
            reqBook.setDestination(scan.nextLine());
            
            switch (reqBook.getDestination()) {
                case "1":
                System.out.println("You Selected: Dumaguete to Cebu");
                reqBook.setDestination(" Dumaguete to Cebu ");
                reqBook.setTicket_price(2000);
                    break;
                case "2":
                System.out.println("Dumaguete to Dipolog");
                    reqBook.setDestination(" Dumaguete to Dipolog ");
                    reqBook.setTicket_price(3000);
                    break;
                case "3":
                System.out.println("Dumaguete to Palawan");
                    reqBook.setDestination(" Dumaguete to Palawan ");
                    reqBook.setTicket_price(3500);
                    break;
                case "4":
                System.out.println("Dumaguete to Siargao");
                reqBook.setDestination(" Dumaguete to Siargao ");
                    reqBook.setTicket_price(4000);
                    break;
                case "5":
                System.out.println("Dumaguete to Manila");
                reqBook.setDestination(" Dumaguete to Manila ");
                    reqBook.setTicket_price(5000);
                    break;                  
            }
            
            //available dates of travel
            System.out.println("\nAvailable Dates");
            System.out.println("1. May 1, 2024");
            System.out.println("2. May 2, 2024");
            System.out.println("3. May 3, 2024");
            System.out.println("4. May 4, 2024");
            System.out.println("5. May 5, 2024");
            
            
            System.out.println("\n Select Date of Travel:");
            reqBook.setDeparture_date(scan.nextLine());
            
            switch (reqBook.getDeparture_date()) {
                case "1":
                System.out.println("May 1, 2024");
                    reqBook.setDeparture_date("May 1, 2024");
                    break;
                case "2":
                System.out.println("May 2, 2024");
                    reqBook.setDeparture_date("May 2, 2024");
                    break;
                case "3":
                System.out.println("May 3, 2024");
                    reqBook.setDeparture_date("May 3, 2024");
                    break;
                case "4":
                System.out.println("May 4, 2024");
                    reqBook.setDeparture_date("May 4, 2024");
                    break;
                case "5":
                System.out.println("May 5, 2024");
                    reqBook.setDeparture_date("May 5, 2024");
                    break;
            }
            
            //departure time
            System.out.println("\nAvailable Departure Time");
            System.out.println("1. 9:00AM");
            System.out.println("2. 12:00AM");
            System.out.println("3. 3:00PM");
            System.out.println("4. 6:00PM");
            System.out.println("5. 9:00PM");

            System.out.println("\n Select Departure Time:");
            reqBook.setDeparture_time(scan.nextLine());
            
            switch (reqBook.getDeparture_time()) {
                case "1":
                    System.out.println("9:00AM");
                    reqBook.setDeparture_time("9:00AM");
                    break;
                case "2":
                System.out.println("12:00AM");               
                    reqBook.setDeparture_time("12:00AM");
                    break;
                case "3":
                System.out.println("3:00AM");
                    reqBook.setDeparture_time("3:00PM");
                    break;
                case "4":
                 System.out.println("6:00PM");
                    reqBook.setDeparture_time("6:00PM");
                    break;
                case "5":
                System.out.println("9:00PM");
                    reqBook.setDeparture_time("9:00PM");
                    break;
                
            }
            
            //select passenger type
            System.out.println("\nPassenger Type");
            System.out.println("1. Regular ");
            System.out.println("2. Student ");
            System.out.println("3. Senior Citizen ");
            System.out.println("4. PWD ");
            
            System.out.println("Select what Passenger Type:");
            reqBook.setPassenger_type(scan.nextLine());
            
            switch (reqBook.getPassenger_type()){ 
                case "1" :
                    reqBook.setPassenger_type(" Regular ");
                    reqBook.setDiscount_price(0);
                    System.out.println("You Selected: Regular");
                    break;
                case "2":
                    reqBook.setPassenger_type(" Student ");
                    reqBook.setDiscount_price(0.10);
                    System.out.println("You Selected: Student");
                    break;
                case "3":
                    reqBook.setPassenger_type(" Senior Citizen ");
                    reqBook.setDiscount_price(0.20);
                    System.out.println("You Selected: Senior Citizen");
                    break;
                case "4":
                    reqBook.setPassenger_type(" PWD ");
                    reqBook.setDiscount_price(0.30);
                    System.out.println("You Selected: PWD ");
                    break;
            }
            
            //select SEAT TYPE
            System.out.println("Seat Type");
            System.out.println("1. ECONOMY CLASS");
            System.out.println("2. PREMIUM CLASS");
            System.out.println("3. BUSINESS CLASS");
            
            System.out.println("Select what Seat Type:");
            reqBook.setSeat_price(scan.nextInt());
          
            switch (reqBook.getSeat_price()){
             
                case 1: 
                    reqBook.setSeat_price(1500);
                    reqBook.setSeat_type(" Economy ");
                    System.out.println("You Selected: Economy");
                    break;
                case 2: 
                    reqBook.setSeat_price(4500);
                    reqBook.setSeat_type(" Premium ");
                    System.out.println("You Selected: Premium");
                    break;
                case 3:
                    reqBook.setSeat_price(5000);
                    reqBook.setSeat_type(" Business ");
                    System.out.println("You Selected: Business");
                    break;                
            }
            //input quantity of tickets
               System.out.println("Input Quanity of Tickets: ");
               reqBook.setTicket_quantity(scan.nextInt());
            
            //Reciept
          
           Receipt rep = new Receipt();
           
           double total_amount = ((reqBook.getTicket_price() + reqBook.getSeat_price()) - reqBook.getDiscount_price());
           double total_pay = total_amount * reqBook.getTicket_quantity();
           reqBook.setTicket_price(total_pay);
           System.out.println("Total Amount to Pay: " + reqBook.getTicket_price());
           System.out.println("Input Balance: ");        
           double amount_pay = scan.nextInt();
           
           if(amount_pay == total_pay || amount_pay > total_pay){
               rep.printReceipt();
               System.out.println("--------------------------------------------------------------------------");
               System.out.println("Total: "+ total_pay);
               System.out.println("Paid: "+ amount_pay);
               System.out.println("--------------------------------------------------------------------------");
               if(amount_pay > total_pay){
               //display change:
                  double bal_change = amount_pay - total_pay;
                  reqBook.setCash_change(bal_change);
                  double change = reqBook.getCash_change();
                  System.out.println("Change: "+ change );
               }
           
          else if (amount_pay < total_pay){
          
               System.out.println("Error! incuffient balance");
          }
           
           TicketAction ta = new TicketActionImpl();
           
                   if( ta.add(reqBook) == true){
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
        
        scan.nextLine();
            System.out.println("Do you want another request? Y or N?");
            if(scan.nextLine().equals("N")){
                break;
            }
    }
    
           }
 }
    
      public static void viewSpecificBook(){
     System.out.println("View Specific Booked");
     
     TicketAction rba = new TicketActionImpl();
    
    List<Ticket> myList = rba.viewAll();
    
    System.out.println("Enter Ticket ID: ");
    int ticketID = scan.nextInt();
    Ticket ticket = rba.view(ticketID);
    
    if(ticket.getTicket_id() != 0){
        System.out.println( myList.size()  + " Records Found");
        
        ticket.displaySpecificTransac();
    } else{
        System.out.println("No Records Found");
    }  
 }
       public static void viewAllBooking(){
    System.out.println("View All Transactions");
    
     TicketAction rba = new TicketActionImpl();
     
     List<Ticket> allTickets = rba.viewAll();
     
     if(allTickets.isEmpty()){
         System.out.println("No Records Found");
     } else{
         for(Ticket all_tickets : allTickets){
               all_tickets.displayAllTransac();
               System.out.println("--------------------------");
               
         }
     }
    
   
   scan.nextLine();
}
      
      public static void updateBooking(){
          
          Ticket reqBook = new Ticket();
          Passenger pass = new Passenger();
            
          while(true){            
            
            //enter passenger details
            System.out.println("Enter ID: ");
            reqBook.setTicket_id(scan.nextInt());
            scan.nextLine();
            
            //select a destination
            System.out.println("\nAvailable Destinations");
            System.out.println("1. Dumaguete to Cebu - 1500");
            System.out.println("2. Dumaguete to Dipolog - 3000");
            System.out.println("3. Dumaguete to Palawan - 3500");
            System.out.println("4. Dumaguete to Siargao - 4000");
            System.out.println("5. Dumaguete to Manila - 5000");
            
            System.out.println("\nSelect a Destination:");
            reqBook.setDestination(scan.nextLine());
            
            switch (reqBook.getDestination()) {
                case "1":
                System.out.println("You Selected: Dumaguete to Cebu");
                reqBook.setDestination(" Dumaguete to Cebu ");
                reqBook.setTicket_price(2000);
                    break;
                case "2":
                System.out.println("Dumaguete to Dipolog");
                    reqBook.setDestination(" Dumaguete to Dipolog ");
                    reqBook.setTicket_price(3000);
                    break;
                case "3":
                System.out.println("Dumaguete to Palawan");
                    reqBook.setDestination(" Dumaguete to Palawan ");
                    reqBook.setTicket_price(3500);
                    break;
                case "4":
                System.out.println("Dumaguete to Siargao");
                reqBook.setDestination(" Dumaguete to Siargao ");
                    reqBook.setTicket_price(4000);
                    break;
                case "5":
                System.out.println("Dumaguete to Manila");
                reqBook.setDestination(" Dumaguete to Manila ");
                    reqBook.setTicket_price(5000);
                    break;                  
            }
            
            //select passenger type
            System.out.println("\nPassenger Type");
            System.out.println("1. Regular ");
            System.out.println("2. Student ");
            System.out.println("3. Senior Citizen ");
            System.out.println("4. PWD ");
            
            System.out.println("Select what Passenger Type:");
            reqBook.setPassenger_type(scan.nextLine());
            
            switch (reqBook.getPassenger_type()){ 
                case "1" :
                    reqBook.setPassenger_type(" Regular ");
                    reqBook.setDiscount_price(0);
                    System.out.println("You Selected: Regular");
                    break;
                case "2":
                    reqBook.setPassenger_type(" Student ");
                    reqBook.setDiscount_price(0.10);
                    System.out.println("You Selected: Student");
                    break;
                case "3":
                    reqBook.setPassenger_type(" Senior Citizen ");
                    reqBook.setDiscount_price(0.20);
                    System.out.println("You Selected: Senior Citizen");
                    break;
                case "4":
                    reqBook.setPassenger_type(" PWD ");
                    reqBook.setDiscount_price(0.30);
                    System.out.println("You Selected: PWD ");
                    break;
            }
            
            //select SEAT TYPE
            System.out.println("Seat Type");
            System.out.println("1. ECONOMY CLASS");
            System.out.println("2. PREMIUM CLASS");
            System.out.println("3. BUSINESS CLASS");
            
            System.out.println("Select what Seat Type:");
            reqBook.setSeat_price(scan.nextInt());
          
            switch (reqBook.getSeat_price()){
             
                case 1: 
                    reqBook.setSeat_price(1500);
                    reqBook.setSeat_type(" Economy ");
                    System.out.println("You Selected: Economy");
                    break;
                case 2: 
                    reqBook.setSeat_price(4500);
                    reqBook.setSeat_type(" Premium ");
                    System.out.println("You Selected: Premium");
                    break;
                case 3:
                    reqBook.setSeat_price(5000);
                    reqBook.setSeat_type(" Business ");
                    System.out.println("You Selected: Business");
                    break;                
            }
            //input quantity of tickets
               System.out.println("Input Quanity of Tickets: ");
               reqBook.setTicket_quantity(scan.nextInt());
            
            //Reciept
          
           Receipt rep = new Receipt();

           
           double total_amount = ((reqBook.getTicket_price() + reqBook.getSeat_price()) - reqBook.getDiscount_price());
           double total_pay = total_amount * reqBook.getTicket_quantity();
           reqBook.setTicket_price(total_pay);
           System.out.println("Total Amount to Pay: " + reqBook.getTicket_price());
           System.out.println("Input Balance: ");        
           double amount_pay = scan.nextInt();
           
           if(amount_pay == total_pay || amount_pay > total_pay){
               rep.printReceipt();
               System.out.println("--------------------------------------------------------------------------");
               System.out.println("Total: "+ total_pay);
               System.out.println("Paid: "+ amount_pay);
               System.out.println("--------------------------------------------------------------------------");
               if(amount_pay > total_pay){
               //display change:
                  double bal_change = amount_pay - total_pay;
                  reqBook.setCash_change(bal_change);
                  double change = reqBook.getCash_change();
                  System.out.println("Change: "+ change );
               }
           
          else if (amount_pay < total_pay){
          
               System.out.println("Error! incuffient balance");
          }
           
           TicketAction ta = new TicketActionImpl();
           
            if( ta.edit(reqBook) == true){
                System.out.println("Success!");
            } else {
                System.out.println("Failed!");
            }
        
        scan.nextLine();
            System.out.println("Do you want another request? Y or N?");
            if(scan.nextLine().equals("N")){
                break;
            }
    }
    
          }
      
      }
      
      
       public static void deleteBooking(){
    System.out.println("Cancel/Delete Booking");
    
    Ticket reqBook = new Ticket();
    
        System.out.println("Enter ID to Delete:");
        reqBook.setTicket_id(scan.nextInt());
       
    
    TicketAction rba = new TicketActionImpl();
    
    if( rba.delete(reqBook.getTicket_id()) == true){
        System.out.println("Success Delete!");
    } else {
        System.out.println("Failed to Delete!");
    }
    
    scan.nextLine();
    
}
    
}