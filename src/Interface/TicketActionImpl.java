package Interface;

import ConnectDB.ConnectDB;
import Model.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TicketActionImpl implements TicketAction {

    @Override
    public boolean add(Ticket reqBook) {    
        
        boolean result = false;  
        
        try{
            
            Connection connection = ConnectDB.connectToDB();
            String query = "INSERT INTO ticketdata VALUES(null,?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = connection.prepareStatement(query);
            
            ps.setString(1, reqBook.getDestination());
            ps.setString(2, reqBook.getPassenger_type());
            ps.setString(3, reqBook.getSeat_type());
            ps.setString(4, reqBook.getDeparture_date());
            ps.setString(5, reqBook.getDeparture_time());
            ps.setInt(6, reqBook.getTicket_quantity());
            ps.setDouble(7, reqBook.getTicket_price());
            ps.setDouble(8, reqBook.getCash_change());
            
            if(ps.executeUpdate() == 1){
                result = true;
            }
            
            
        } catch (Exception e){
            System.out.println(e);
        }
          
        return result;
         
    }

    @Override
    public Ticket view(int myId) {
        Ticket reqBook = new Ticket();
        
        try {

            Connection connection = ConnectDB.connectToDB();
            String query = "SELECT * FROM ticketdata where ticket_id = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, myId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                reqBook.setTicket_id(rs.getInt("ticket_id") );
                reqBook.setDestination( rs.getString("destination") );
                reqBook.setPassenger_type( rs.getString("passenger_type") );
                reqBook.setSeat_type( rs.getString("seat_type") );
                reqBook.setTicket_quantity(rs.getInt("ticket_quantity") );
                reqBook.setTicket_price(rs.getDouble("total_amount") );
                reqBook.setCash_change(rs.getDouble("cash_change") );
         }
    
        } catch (Exception e){
            System.out.println(e);
        }
return reqBook;
    }

    @Override
    public List<Ticket> viewAll() {
        List<Ticket> myList = new ArrayList();
        
        try {

            Connection connection = ConnectDB.connectToDB();
            String query = "SELECT * FROM ticketdata";

            PreparedStatement ps = connection.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Ticket reqBook = new Ticket();
                reqBook.setTicket_id(rs.getInt("ticket_id") );
                reqBook.setDestination( rs.getString("destination") );
                reqBook.setPassenger_type( rs.getString("passenger_type") );
                reqBook.setSeat_type( rs.getString("seat_type") );
                reqBook.setTicket_quantity(rs.getInt("ticket_quantity") );
                reqBook.setTicket_price(rs.getDouble("total_amount") );
                reqBook.setCash_change(rs.getDouble("cash_change") );
                
                myList.add(reqBook);
            }
    
        } catch (Exception e){
            System.out.println(e);
        }
        
        return myList;
    }

    @Override
    public boolean edit(Ticket reqBook) {
        boolean result = false;
        try{
    
            Connection connection = ConnectDB.connectToDB();
            String query = " UPDATE ticketdata set destination = ?, passenger_type = ?, seat_type = ?, ticket_quantity = ?, cash_change = ? WHERE ticket_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, reqBook.getDestination());
            ps.setString(2, reqBook.getPassenger_type());
            ps.setString(3, reqBook.getSeat_type());
            ps.setInt(4, reqBook.getTicket_quantity());
            ps.setDouble(5, reqBook.getCash_change());
            ps.setInt(6, reqBook.getTicket_id());

            if(ps.executeUpdate() == 1){
                result = true;
            }


        } catch (Exception e){
            System.out.println(e);
        }
        
        
        return result;
    }

    @Override
    public boolean delete(int ticket_IdToDelete) {
        
        boolean result = false;
        try{
    
    Connection connection = ConnectDB.connectToDB();
    String query = " DELETE FROM ticketdata WHERE ticket_id = ? ";
    PreparedStatement ps = connection.prepareStatement(query);
    ps.setInt(1, ticket_IdToDelete);
    
    if(ps.executeUpdate() == 1){
        result = true;
    }
    
    
} catch (Exception e){
    System.out.println(e);
}
        
        return result;
    }
}
    
    
    

