package abstractfactory;

public class BusinessTransport implements Transport {
    public void book() {
        System.out.println("Замовлення преміум трансферу");
    }
}
