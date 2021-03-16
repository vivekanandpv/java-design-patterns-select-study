package in.athenaeum;

public class SubprimeApprovalStrategy implements ApprovalStrategy {
    @Override
    public boolean getResult(ApplicationBase application) {
        return
                application.getCreditScore() > 650 &&
                        application.isCityDweller();
    }
}
