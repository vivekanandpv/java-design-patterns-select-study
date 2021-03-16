package in.athenaeum;

public abstract class ApplicationBase {
    private final int annualIncome;
    private final int creditScore;
    private final boolean cityDweller;
    private final int existingLoans;
    private final int outstandingLoanAmount;

    public ApplicationBase(int annualIncome, int creditScore, boolean cityDweller, int existingLoans, int outstandingLoanAmount) {
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
        this.cityDweller = cityDweller;
        this.existingLoans = existingLoans;
        this.outstandingLoanAmount = outstandingLoanAmount;
    }

    public final boolean isApproved(ApprovalStrategy strategy) {
        return strategy.getResult(this);
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public boolean isCityDweller() {
        return cityDweller;
    }

    public int getExistingLoans() {
        return existingLoans;
    }

    public int getOutstandingLoanAmount() {
        return outstandingLoanAmount;
    }
}
