package facade;

import abstractfactory.*;
import mediator.*;

public class TravelBookingFacade {
    private TravelFactory factory;

    public TravelBookingFacade(TravelFactory factory) {
        this.factory = factory;
    }

    public void bookFullTrip() {
        Ticket ticket = factory.createTicket();
        Hotel hotel = factory.createHotel();
        Transport transport = factory.createTransport();

        BookingComponent ticketComponent = new MediatedTicket(ticket);
        BookingComponent hotelComponent = new MediatedHotel(hotel);
        BookingComponent transportComponent = new MediatedTransport(transport);

        TravelCoordinator coordinator = new TravelCoordinator();
        coordinator.setComponents(ticketComponent, hotelComponent, transportComponent);

        System.out.println("=== Початок бронювання (через Facade + Mediator) ===");
        coordinator.startBooking();
    }
}
