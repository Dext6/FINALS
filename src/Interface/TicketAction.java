package Interface;

import Model.Ticket;
import java.util.List;

 public interface TicketAction {
    public boolean add(Ticket reqBook);
    public boolean edit(Ticket reqBook);
    public boolean delete (int id);
    public Ticket view(int id);
    public List<Ticket> viewAll();
 }
