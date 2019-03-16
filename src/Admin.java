
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Admin {

    public static List<User> userList = new ArrayList<>();

    public static List<Vehicle> vehicleList = new ArrayList<>();

    public static Map<RideTourMap, List<OfferRide>> rideMap = new HashMap<>();

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

        if(!rideMap.containsKey(rideTourMap)){
            List<OfferRide> offerRideList = new ArrayList<>();
            offerRideList.add(offerRide);
            rideMap.put(rideTourMap, offerRideList);
        }
        else {
            List<OfferRide> offerRideList = rideMap.get(rideTourMap);
            offerRideList.add(offerRide);
            rideMap.put(rideTourMap, offerRideList);
        }
    }


    public void bookRide(RideBooking rideBooking)
    {
        RideTourMap rideTourMap = new RideTourMap(rideBooking.getSource(), rideBooking.getDestination());
        if(!rideMap.containsKey(rideTourMap)){
            System.out.println("No Rides Found");
            return;
        }

        List<OfferRide> offerRideList = rideMap.get(rideTourMap);

        OfferRide res = null;

        int min = Integer.MAX_VALUE;
        Date minDate = getDate(3000,1,1,1);


        for(OfferRide offerRide : offerRideList)
        {
            if(rideBooking.getSelectionStrategy() == SelectionStrategy.FASTEST)
            {
                int duration = Integer.parseInt(offerRide.getDuration().split(" ")[0]);
                if(min>duration)
                {
                    res = offerRide;
                }
            }
            else if(rideBooking.getSelectionStrategy() == SelectionStrategy.EARLIEST)
            {
                if(minDate.after(offerRide.getStartTime()))
                {
                    res = offerRide;
                }
            }
        }
        System.out.println("Your Ride is = "+res);

        // remove offer ride

        rideBookingList.add(rideBooking);
    }


    public Date getDate(int year, int month, int date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);
        cal.set(Calendar.HOUR_OF_DAY, hour);

        Date date1 = cal.getTime();

        return date1;
    }



}