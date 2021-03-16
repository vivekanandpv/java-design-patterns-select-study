package in.athenaeum;

public class PrimeApprovalStrategy implements ApprovalStrategy {
    @Override
    public boolean getResult(ApplicationBase application) {
        return
                application.getCreditScore() > 750 &&
                        application.getExistingLoans() < 10000 &&
                        application.isCityDweller();
    }
}
