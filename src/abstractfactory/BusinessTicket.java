package abstractfactory;

public class BusinessTicket implements Ticket {
    public void book() {
        System.out.println("Бронювання бізнес-класу");
    }
}
