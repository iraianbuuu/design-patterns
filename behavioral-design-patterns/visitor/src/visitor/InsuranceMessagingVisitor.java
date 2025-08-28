package visitor;

import models.Bank;
import models.Client;
import models.Restaurant;
import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Sending mail about theft insurance to " + bank.getName());
    }

    public void visit(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance to " + restaurant.getName());
    }
}
