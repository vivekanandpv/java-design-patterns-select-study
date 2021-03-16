package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        ApplicationBase application = new LoanApplication(
                100000,
                780,
                true,
                2,
                5000
        );

        System.out.println(application.isApproved(new PrimeApprovalStrategy()));
    }
}
