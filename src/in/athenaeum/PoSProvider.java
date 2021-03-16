package in.athenaeum;

public interface PoSProvider {
    static PoS getPointOfSale() {
        return new PointOfSaleProxy(new PointOfSale());
    }
}
