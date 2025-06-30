package mediator;

public interface TravelMediator {
    void notify(BookingComponent sender, String event);
}
