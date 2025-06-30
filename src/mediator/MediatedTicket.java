package mediator;

import abstractfactory.Ticket;

public class MediatedTicket implements BookingComponent {
    private TravelMediator mediator;
    private Ticket ticket;

    public MediatedTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void setMediator(TravelMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void book() {
        System.out.println("Спроба бронювання квитка...");
        ticket.book();
        boolean success = Math.random() > 0.2;
        if (success) {
            System.out.println("Квиток заброньовано");
            mediator.notify(this, "ticketBooked");
        } else {
            System.out.println("Помилка при бронюванні квитка");
            mediator.notify(this, "ticketFailed");
        }
    }
}
