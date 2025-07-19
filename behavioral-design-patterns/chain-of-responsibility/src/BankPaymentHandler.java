public class BankPaymentHandler extends PaymentHandler {
    public void handlePayment(double amount) {
        if(amount < 10000){
            System.out.println("Paid using bank $" + amount);
        }
        else{
            next.handlePayment(amount);
        }
    }
}