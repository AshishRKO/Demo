

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Admin {

    public static List<User> userList = new ArrayList<>();

    public static List<Vehicle> vehicleList = new ArrayList<>();

    public static Map<RideTourMap, OfferRide> rideMap = new HashMap<>();

    public static List<RideBooking> rideBookingList = new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }


    public void addVehicle(Vehicle vehicle)
    {
        vehicleList.add(vehicle);
    }

    public void offerRide(OfferRide offerRide)
    {
        RideTourMap rideTourMap = new RideTourMap(offerRide.getSource(), offerRide.getDestination());
        rideMap.put(rideTourMap, offerRide);
    }


    public void bookRide(RideBooking rideBooking)
    {
        RideTourMap rideTourMap = new RideTourMap(rideBooking.getSource(), rideBooking.getDestination());
        if(!rideMap.containsKey(rideTourMap)){
            System.out.println("No Rides Found");
            return;
        }

        OfferRide offerRide = rideMap.get(rideTourMap);
        int seats = offerRide.getAvaialbleSeats();

        if(seats >= rideBooking.getSeats()) {
            System.out.println("Your Ride is = "+offerRide);

            // remove offer ride
            rideMap.get(rideTourMap).setAvaialbleSeats(seats - rideBooking.getSeats());

            rideBookingList.add(rideBooking);
        } else {
            System.out.println("No Rides Found");
            return;
        }


    }



}