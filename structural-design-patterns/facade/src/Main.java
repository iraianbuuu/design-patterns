public class Main {
    public static void main(String... args) {

        // Without Facade
        User user = new User("Iraianbu", "iraianbu011@gmail.com", "09123456789");

        
        TicketSystem ticketSystem = new TicketSystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        NotificationSystem notificationSystem = new NotificationSystem();

        ticketSystem.createTicket(user, 1, "Dune 2");
        paymentSystem.processPayment(user, 100);
        notificationSystem.sendSMSNotification(user);
        notificationSystem.sendEmailNotification(user);

        // With Facade
        BookingFacade bookingFacade = new BookingFacade(ticketSystem, paymentSystem, notificationSystem);
        bookingFacade.bookTicket(user, 1, "Dune 2");
    }
}
