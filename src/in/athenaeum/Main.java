package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        PoS pointOfSale = PoSProvider.getPointOfSale();
        pointOfSale.swipeCard("1234 5678 9874 6523");
    }
}
