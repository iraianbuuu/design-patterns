import strategy.PaymentByCreditCard;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new PaymentByCreditCard());

        paymentService.processOrder(1000);

    }
}
