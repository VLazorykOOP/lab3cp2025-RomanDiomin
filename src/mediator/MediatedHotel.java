package mediator;

import abstractfactory.Hotel;

public class MediatedHotel implements BookingComponent {
    private TravelMediator mediator;
    private Hotel hotel;

    public MediatedHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void setMediator(TravelMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void book() {
        System.out.println("Спроба бронювання готелю...");
        hotel.book();
        boolean success = Math.random() > 0.3;
        if (success) {
            System.out.println("Готель заброньовано");
            mediator.notify(this, "hotelBooked");
        } else {
            System.out.println("Помилка при бронюванні готелю");
            mediator.notify(this, "hotelFailed");
        }
    }
}
