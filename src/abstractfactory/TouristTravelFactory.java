package abstractfactory;

public class TouristTravelFactory implements TravelFactory {
    public Ticket createTicket() {
        return new TouristTicket();
    }
    public Hotel createHotel() {
        return new TouristHotel();
    }
    public Transport createTransport() {
        return new TouristTransport();
    }
}
