package dojo;

import java.util.List;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    
    private Order order;
    
    @Given("{word} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String owner) {
        order = new Order();
        order.declareOwner(owner);
    }

    @When("an order is declared for {word}")
    public void an_order_is_declared_for_Juliette(String target) {
        order.declareTarget(target);
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.addMessage(message);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_no_cocktail_in_the_order(int nbCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expectedTicket) {
        String actualTicket = order.getTicket();
        assertEquals(expectedTicket, actualTicket);
    }

}
