package models;

import visitor.Visitor;

public abstract class Client {
    private String name;
    private String address;
    private String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public abstract void accept(Visitor visitor);
}
