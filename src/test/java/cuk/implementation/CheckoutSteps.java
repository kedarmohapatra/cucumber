package cuk.implementation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Checkout;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {
    int bananaPrice=0;
    int applePrice=0;

    Checkout checkout = new Checkout();

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        if(name.equals("banana"))
            bananaPrice = price;
        if(name.equals("apple"))
            applePrice = price;
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        if(itemName.equals("banana"))
            checkout.add(itemCount, bananaPrice);
        if(itemName.equals("apple"))
            checkout.add(itemCount, applePrice);

    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
