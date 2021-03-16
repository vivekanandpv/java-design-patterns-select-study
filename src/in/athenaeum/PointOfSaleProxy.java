package in.athenaeum;

public class PointOfSaleProxy implements PoS {
    private final PointOfSale pointOfSale;

    public PointOfSaleProxy(PointOfSale pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    public void swipeCard(String cardNumber) {
        System.out.println("Diagnostic: PointOfSaleProxy: Card Swipe : " + cardNumber );
        this.pointOfSale.swipeCard(cardNumber);
    }
}
