package com.example.jenkins_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanServiceTest {

    private final LoanService loanService = new LoanService();

    @Test
    void customerShouldBeEligibleWhenRemainingIncomeIsAtLeast10000() {
        boolean result = loanService.isEligible(30000, 20000);

        assertTrue(result);
    }

    @Test
    void customerShouldNotBeEligibleWhenRemainingIncomeIsBelow10000() {
        boolean result = loanService.isEligible(25000, 16000);

        assertFalse(result);
    }
}