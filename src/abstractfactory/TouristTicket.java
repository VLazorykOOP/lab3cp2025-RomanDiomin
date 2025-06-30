package abstractfactory;

public class TouristTicket implements Ticket {
    public void book() {
        System.out.println("Бронювання авіаквитка для туриста");
    }
}
