package abstractfactory;

public class TouristHotel implements Hotel {
    public void book() {
        System.out.println("Бронювання готелю для туриста");
    }
}
