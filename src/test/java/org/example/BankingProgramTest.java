package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingProgramTest {

    @Test
    void mainTest() {
    }

    @Test
    void bankInterfaceTest() {
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