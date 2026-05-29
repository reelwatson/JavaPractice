package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingProgramTest {

    BankingProgram newTransaction = new BankingProgram();
    String atreides = "Atreides";
    String harkonnen = "Harkonnen";
    String corrino = "Corrino";
    long deposit = 789;
    long withdrawal = 123;
    // long tooLargeDeposit
    // long tooLargeWithdrawal


    @Test
    public void mainTest() {
    }
    // TO DO: CSV file with names, special greetings, and amounts in checking and savings
    // That way can test responses quickly rather than hard-coding tests as below

    @Test
    void bankInterfaceTest_whenLastNameAtreides() {
        // Turns out testing scanner inputs isn't simple!
        // Will come back to this after learning more Java

    }

    @Test
    void bankInterfaceTest_whenLastNameHarkonnen() {

    }

    @Test
    void bankInterfaceTest_whenLastNameCorrino() {
    }

    @Test
    void bankInterfaceTest_whenLastNameInvalid() {
    }

    @Test
    void bankInterfaceTest_whenLastNameInvalidThenValid() {
        // Want to validate that the personalized message still shows
        // TO DO: Refactor class to meet the above requirement
    }

    @Test
    void bankInterfaceTest_whenOptionIsOne() {
    }

    @Test
    void bankInterfaceTest_whenOptionIsTwo() {
    }

    @Test
    void bankInterfaceTest_whenOptionIsThree() {
    }

    @Test
    void bankInterfaceTest_whenOptionIsFour() {
    }

    @Test
    void bankInterfaceTest_whenOptionIsInvalid() {
    }

    @Test
    public void showAccountsTest_whenHouseholdNameAtreides() {
        // Lol this is ALSO more complicated than expected!
        // Return to this when working on capturing system print lines in tests
        newTransaction.showAccounts(atreides);
        String checkingAccountMessage;
        String savingsAccountMessage;
        String totalMessage;
        // Assertions.equals();
    }

    @Test
    void showAccountsTest_whenHouseholdNameHarkonnen() {

    }

    @Test
    void showAccountsTest_whenHouseholdNameCorrino() {

    }

    @Test
    void showAccountsTest_whenHouseholdNameBlank() {
        // Throw an exception?
    }

    @Test
    void depositToAccountTest_whenHouseholdNameAtreides() {
        long actual = newTransaction.depositToAccount(atreides, deposit);
        long expected = 3600989;
        Assertions.assertEquals(expected, actual, "The expected amount was 3,600,989, instead returned " + actual);
    }

    @Test
    void depositToAccountTest_whenHouseholdNameHarkonnen() {

    }

    @Test
    void depositToAccountTest_whenHouseholdNameCorrino() {

    }

    @Test
    void depositToAccountTest_whenDepositNegative() {
        // TO DO: Refactor code so a negative number is not allowed
    }

    @Test
    void depositToAccountTest_whenTotalExceedsLongMax() {
        // TO DO: Refactor code to avoid overflow issues
        // Show message to user when total would be greater than max long
        // Restart transaction
    }

    @Test
    void withdrawFromAccountTest_whenHouseholdNameAtreides() {

    }

    @Test
    void withdrawFromAccountTest_whenHouseholdNameHarkonnen() {

    }

    @Test
    void withdrawFromAccountTest_whenHouseholdNameCorrino() {

    }

    @Test
    void withdrawFromAccountTest_whenNewTotalIsNegative() {

    }

    @Test
    void withdrawFromAccountTest_whenNewTotalIsTooLow() {
        // TO DO: Refactor code to avoid going below MIN long value
        // Show message to user telling them to pick a smaller withdrawal
        // Restart the loop
    }
}