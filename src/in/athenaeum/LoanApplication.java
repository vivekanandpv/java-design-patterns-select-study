package in.athenaeum;

public class LoanApplication extends ApplicationBase {
    public LoanApplication(
            int annualIncome,
            int creditScore,
            boolean cityDweller,
            int existingLoans,
            int outstandingLoanAmount
    ) {
        super(
                annualIncome,
                creditScore,
                cityDweller,
                existingLoans,
                outstandingLoanAmount
        );
    }
}
