
package Model;

public class Ticket {
    
    //ticket information
    private int ticket_id;
    private String destination;
    private String passenger_type;
    private String seat_type;
    private String departure_date;
    private String departure_time;
    
   //prices
    private double ticket_price;
    private double discount_price;
    private int seat_price;
    private int ticket_quantity;
    private double cash_change;

    public int getTicket_quantity() {
        return ticket_quantity;
    }

    public void setTicket_quantity(int ticket_quantity) {
        this.ticket_quantity = ticket_quantity;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPassenger_type() {
        return passenger_type;
    }

    public void setPassenger_type(String passenger_type) {
        this.passenger_type = passenger_type;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }

    public int getSeat_price() {
        return seat_price;
    }

    public void setSeat_price(int seat_price) {
        this.seat_price = seat_price;
    } 

    public double getCash_change() {
        return cash_change;
    }

    public void setCash_change(double cash_change) {
        this.cash_change = cash_change;
    }
    
    public void displaySpecificTransac(){
        
        System.out.println("SPECIFIC TRANSACTION\n");
        System.out.println("Ticket ID: " + ticket_id);
        System.out.println("Destination: " + destination);
        System.out.println("Passenger Type: " + passenger_type);
        System.out.println("Seat Type: " + seat_type);
        System.out.println("Quantity: " + ticket_quantity);
        System.out.println("Total Price: " + ticket_price);
        System.out.println("Change: " + cash_change);
        
    }
    
    public void displayAllTransac(){
        
        System.out.println("SPECIFIC TRANSACTION\n");
        System.out.println("Ticket ID: " + ticket_id);
        System.out.println("Destination: " + destination);
        System.out.println("Passenger Type: " + passenger_type);
        System.out.println("Seat Type: " + seat_type);
        System.out.println("Quantity: " + ticket_quantity);
        System.out.println("Total Price: " + ticket_price);
        System.out.println("Change: " + cash_change);
        
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    

