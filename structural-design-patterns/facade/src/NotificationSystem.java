/**
 * NotificationSystem class represents the notification subsystem.
 * 
 */
public class NotificationSystem {
    public void sendSMSNotification(User user) {
        System.out.println("SMS Notification sent successfully to " + user.getName());
    }

    public void sendEmailNotification(User user) {
        System.out.println("Email Notification sent successfully to " + user.getName());
    }
}
