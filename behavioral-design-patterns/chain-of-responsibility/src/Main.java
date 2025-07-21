public class Main {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        bank.setNext(creditCard);

        bank.handlePayment(7500);
        bank.handlePayment(11000);
    }    
}