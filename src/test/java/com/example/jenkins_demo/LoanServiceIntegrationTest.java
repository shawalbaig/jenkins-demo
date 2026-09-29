package com.example.jenkins_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LoanServiceIntegrationTest {

    @Autowired
    private LoanService loanService;

    @Test
    void eligibleCustomerShouldPassLoanAssessment() {
        assertTrue(loanService.isEligible(40000, 25000));
    }

    @Test
    void ineligibleCustomerShouldFailLoanAssessment() {
        assertFalse(loanService.isEligible(30000, 22000));
    }
}