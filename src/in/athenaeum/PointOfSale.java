package in.athenaeum;

public class PointOfSale implements PoS {
    public void swipeCard(String cardNumber) {
        System.out.println("PointOfSale: Card Swipe : " + cardNumber );
    }
}
