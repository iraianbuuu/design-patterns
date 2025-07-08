/**
 * TicketSystem class represents the ticket subsystem.
 * 
 */
public class TicketSystem {
    public void createTicket(User user, int ticketId, String movieName) {
        System.out.println("Ticket created successfully for " + user.getName() + " with ticket ID " + ticketId
                + " for movie " + movieName);
    }
}
