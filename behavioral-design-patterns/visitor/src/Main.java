import java.util.List;
import models.Bank;
import models.Client;
import models.Restaurant;
import visitor.InsuranceMessagingVisitor;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = List.of(
            new Bank("bank_name", "bank_address", "bank_number", 10, 100),
            new Restaurant("resto_name", "resto_address", "resto_number", 10, 100)
            );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
    }
}
