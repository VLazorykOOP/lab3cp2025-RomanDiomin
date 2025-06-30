import abstractfactory.*;
import facade.*;

public class Main {
    public static void main(String[] args) {
        TravelFactory touristFactory = new TouristTravelFactory();
        TravelBookingFacade touristFacade = new TravelBookingFacade(touristFactory);
        touristFacade.bookFullTrip();

        TravelFactory businessFactory = new BusinessTravelFactory();
        TravelBookingFacade businessFacade = new TravelBookingFacade(businessFactory);
        businessFacade.bookFullTrip();
    }
}
