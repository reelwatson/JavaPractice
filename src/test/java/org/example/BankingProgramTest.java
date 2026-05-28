package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingProgramTest {

    @Test
    void mainTest() {
    }
    // TO DO: CSV file with names, special greetings, and amounts in checking and savings
    // That way can test responses quickly rather than hard-coding tests as below

    @Test
    void bankInterfaceTest_whenLastNameAtreides() {
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
    void showAccountsTest_whenHouseholdNameAtreides() {

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