public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(new BankAccount(1000));
        atm.deposit(500);
        atm.withdraw(200);
        System.out.println("Balance: " + atm.getBalance());
    }
}