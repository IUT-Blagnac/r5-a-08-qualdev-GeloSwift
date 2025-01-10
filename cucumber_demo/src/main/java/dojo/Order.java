package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;
    private String message;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public void declareOwner(String o) {
        this.owner = o;
    }

    public void declareTarget(String t) {
        this.target = t;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }

    public void addMessage(String message) {
        this.message = message;
    }

    public String getTicket() {
        String ticket = "From " + this.owner + " to " + this.target + ": " + this.message;
        return ticket;
    }

}
