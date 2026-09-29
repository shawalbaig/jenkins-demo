package jenkins_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LoanServiceIntegrationTest {

    private final LoanService loanService = new LoanService();

    @Test
    void eligibleCustomerShouldPassLoanAssessment() {
        assertTrue(loanService.isEligible(40000, 25000));
    }

    @Test
    void ineligibleCustomerShouldFailLoanAssessment() {
        assertFalse(loanService.isEligible(30000, 22000));
    }
}