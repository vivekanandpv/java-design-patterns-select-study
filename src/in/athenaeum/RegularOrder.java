package in.athenaeum;

public class RegularOrder extends OrderBase {
    @Override
    public void ensurePaymentReceived() {
        System.out.println("RegularOrder#ensurePaymentReceived");
    }

    @Override
    public void ensureTheStock() {
        System.out.println("RegularOrder#ensureTheStock");
    }

    @Override
    public void packTheOrder() {
        System.out.println("RegularOrder#packTheOrder");
    }

    @Override
    public void shipTheOrder() {
        System.out.println("RegularOrder#shipTheOrder");
    }

    @Override
    public void getReceipt() {
        System.out.println("RegularOrder#println");
    }

    @Override
    public void getFeedback() {
        System.out.println("RegularOrder#getFeedback");
    }
}
