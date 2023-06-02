import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        Long now=System.currentTimeMillis()+(120*60000);
        Date date1=new Date();
        Date date= new Date(now);
        List<Flight> res= airport.getTerminals().stream().flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)).
                filter(flight -> flight.getDate().before(date)).
                filter(flight -> flight.getDate().after(date1))
                .collect(Collectors.toList());
        return res;
    }

}