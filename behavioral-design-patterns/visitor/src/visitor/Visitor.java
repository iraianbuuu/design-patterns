package visitor;

import models.Bank;
import models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Restaurant restaurant);

}
