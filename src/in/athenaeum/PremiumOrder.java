package in.athenaeum;

public class PremiumOrder extends OrderBase {

    @Override
    public void ensurePaymentReceived() {
        System.out.println("PremiumOrder#ensurePaymentReceived");
    }

    @Override
    public void ensureTheStock() {
        System.out.println("PremiumOrder#ensureTheStock");
    }

    @Override
    public void packTheOrder() {
        System.out.println("PremiumOrder#packTheOrder");
    }

    @Override
    public void shipTheOrder() {
        System.out.println("PremiumOrder#shipTheOrder");
    }

    @Override
    public void getReceipt() {
        System.out.println("PremiumOrder#println");
    }
}
