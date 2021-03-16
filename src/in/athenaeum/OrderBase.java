package in.athenaeum;

public abstract class OrderBase {
    public abstract void ensurePaymentReceived();
    public abstract void ensureTheStock();
    public abstract void packTheOrder();
    public abstract void shipTheOrder();
    public abstract void getReceipt();

    public void getFeedback() {
        System.out.println("OrderBase#getFeedback");
    }

    public final void process() {
        ensurePaymentReceived();
        ensureTheStock();
        packTheOrder();
        shipTheOrder();
        getReceipt();
        getFeedback();
    }
}
