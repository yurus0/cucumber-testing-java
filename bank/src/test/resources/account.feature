Feature: Bank Account Basic Transactions

    Scenario: Create an account and deposit money
        Given a new account created with balance 100
        When I deposit 50 into account
        Then balance should be 150

    Scenario: Create an account and withdraw money
        Given a new account created with balance 100
        When I withdraw 20 from account
        Then balance should be 80