package models;

import visitor.Visitor;

public class Restaurant extends Client {
    private final int branchesInsured;
    private final int employees;

    public Restaurant(String name, String address, String number, int branchesInsured, int employees) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
        this.employees = employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
