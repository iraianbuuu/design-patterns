public class ATM implements Account {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }
}