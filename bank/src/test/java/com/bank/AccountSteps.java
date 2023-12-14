package com.bank;

public class AccountSteps {
    private Account account;

    @Given("a new account created with balance {int}")
    public void createAccount(int initBalance){
        account = new Account();
        account.deposit(initBalance);
    }

    @When("I withdraw {int} from account")
    public void withdrawFromAccount(int amount){
        account.withdraw(amount);
    }
    
    @When("I deposit {int} into account")
    public void depositIntoAccount(int amount){
        account.deposit(amount);
    }

    @Then("balance should be {int}")
    public void verifyBalance(int expectedBalance){
        assertEquals(expectedBalance, account.getBalance());
    }
}
