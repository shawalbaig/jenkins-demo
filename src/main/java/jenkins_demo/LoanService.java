package jenkins_demo;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public boolean isEligible(double monthlyIncome, double monthlyExpenses) {
        return monthlyIncome - monthlyExpenses >= 10000;
    }
}