package mediator;

import abstractfactory.Transport;

public class MediatedTransport implements BookingComponent {
    private TravelMediator mediator;
    private Transport transport;

    public MediatedTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void setMediator(TravelMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void book() {
        System.out.println("Спроба бронювання трансферу...");
        transport.book();
        mediator.notify(this, "transportBooked");
    }
}
