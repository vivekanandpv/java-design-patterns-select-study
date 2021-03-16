package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        OrderBase premiumOrder = new PremiumOrder();
        OrderBase regularOrder = new RegularOrder();

        premiumOrder.process();
        System.out.println("-------------------------------");
        regularOrder.process();
    }
}
