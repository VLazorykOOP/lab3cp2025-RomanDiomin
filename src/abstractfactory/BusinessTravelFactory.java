package abstractfactory;

public class BusinessTravelFactory implements TravelFactory {
    public Ticket createTicket() {
        return new BusinessTicket();
    }
    public Hotel createHotel() {
        return new BusinessHotel();
    }
    public Transport createTransport() {
        return new BusinessTransport();
    }
}
