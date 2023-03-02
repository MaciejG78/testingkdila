package exception.test;

import java.util.HashMap;
import java.util.Map;

public class Airport {

    HashMap<String, Boolean> routeMap = new HashMap<>(Map.of("Barcelona", true,
            "Zakopane", false, "Warszawa", true, "Mediolan", true, "Londyn", true, "Konin", false));

    public void findFilght(Flight flight) throws RouteNotFoundException {
        if (routeMap.containsKey(flight.getArrivalAirport()) && routeMap.containsKey(flight.getArrivalAirport()) && routeMap.get(flight.getDepartureAirport()) && routeMap.get(flight.getArrivalAirport())) {
            System.out.println("This flight is ready to go !!!");
        } else throw new RouteNotFoundException();
    }
}
