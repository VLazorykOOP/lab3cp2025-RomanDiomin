package abstractfactory;

public interface TravelFactory {
    Ticket createTicket();
    Hotel createHotel();
    Transport createTransport();
}
