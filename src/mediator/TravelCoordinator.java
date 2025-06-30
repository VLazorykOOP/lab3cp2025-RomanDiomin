package mediator;

public class TravelCoordinator implements TravelMediator {
    private BookingComponent ticket;
    private BookingComponent hotel;
    private BookingComponent transport;

    public void setComponents(BookingComponent ticket, BookingComponent hotel, BookingComponent transport) {
        this.ticket = ticket;
        this.hotel = hotel;
        this.transport = transport;

        this.ticket.setMediator(this);
        this.hotel.setMediator(this);
        this.transport.setMediator(this);
    }

    public void startBooking() {
        ticket.book();
    }

    @Override
    public void notify(BookingComponent sender, String event) {
        switch (event) {
            case "ticketBooked":
                hotel.book();
                break;
            case "ticketFailed":
                System.out.println("Скасування бронювання: без квитка неможливо продовжити.");
                break;
            case "hotelBooked":
                transport.book();
                break;
            case "hotelFailed":
                System.out.println("Скасування бронювання: без готелю трансфер не потрібен.");
                break;
            case "transportBooked":
                System.out.println("Вся подорож заброньована успішно!");
                break;
        }
    }
}
