public class BookingFacade {
    private TicketSystem ticketSystem;
    private PaymentSystem paymentSystem;
    private NotificationSystem notificationSystem;

    public BookingFacade(TicketSystem ticketSystem, PaymentSystem paymentSystem,
            NotificationSystem notificationSystem) {
        this.ticketSystem = ticketSystem;
        this.paymentSystem = paymentSystem;
        this.notificationSystem = notificationSystem;
    }

    public void bookTicket(User user, int ticketId, String movieName) {
        ticketSystem.createTicket(user, ticketId, movieName);
        paymentSystem.processPayment(user, 100);
        notificationSystem.sendSMSNotification(user);
        notificationSystem.sendEmailNotification(user);
    }
}
