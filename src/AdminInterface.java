/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: AdminInterface.java, v 0.1 2019-03-16 12:08 PM Ashish Barthwal $$
 */
public interface AdminInterface {

    public abstract void addUser(User user);

    public abstract void addVehicle(Vehicle vehicle);

    public abstract void offerRide(OfferRide offerRide);

    public abstract void bookRide(RideBooking rideBooking);

    public abstract void getTotalRides(User user);
}