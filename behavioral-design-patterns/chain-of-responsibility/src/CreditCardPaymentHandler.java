public class CreditCardPaymentHandler extends PaymentHandler {
    public void handlePayment(double amount) {
        if(amount < 30000){
            System.out.println("Paid using credit account: $ " + amount);
        }
        else{
            next.handlePayment(amount);
        }
    }
}