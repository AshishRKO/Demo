
public interface AdminInterface {

    public abstract void addUser(User user);

    public abstract void addVehicle(Vehicle vehicle);

    public abstract void offerRide(OfferRide offerRide);

    public abstract void bookRide(RideBooking rideBooking);
}