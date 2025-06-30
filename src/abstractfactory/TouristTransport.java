package abstractfactory;

public class TouristTransport implements Transport {
    public void book() {
        System.out.println("Замовлення трансферу для туриста");
    }
}
