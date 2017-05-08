package cuk.implementation;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountTransferSteps {

    @Given("^I have deposited \\$(\\d+) in my (\\w+) Account$")
    public void iHaveDeposited$InMyAccount(int money, String accountType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(money);
        System.out.println(accountType);
        throw new PendingException();
    }

    @When("^I transfer \\$(\\d+) from my (\\w+) Account into my (\\w+) Account$")
    public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int money, String accountFrom, String accountTo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(money);
        System.out.println(accountFrom);
        System.out.println(accountTo);
        throw new PendingException();
    }

    @Then("^the balance of the (\\w+) Account should be \\$(\\d+)$")
    public void theBalanceOfTheCheckingAccountShouldBe$(int money, String accountType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(money);
        System.out.println(accountType);
        throw new PendingException();
    }
}
