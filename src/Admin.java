/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ashish Barthwal
 * @version $Id: RideSharing.java, v 0.1 2019-03-16 10:29 AM Ashish Barthwal $$
 */
public class Admin {

    public static List<User> userList = new ArrayList<>();
    public static List<Vehicle> vehicleList = new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }


    public void addVehicle(Vehicle vehicle)
    {
        vehicleList.add(vehicle);
    }


}