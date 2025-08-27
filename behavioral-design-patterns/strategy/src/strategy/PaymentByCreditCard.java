package strategy;

import payment.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard creditCard;

    public PaymentByCreditCard() {
        this.creditCard = new CreditCard();
    }

    @Override
    public void pay(int amount) {
        creditCard.setAmount(creditCard.getAmount() - amount);
        System.out.println("Paid " + amount + " by credit card");
        System.out.println("Balance: " + creditCard.getAmount());
    }

}
