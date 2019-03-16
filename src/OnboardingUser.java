/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sumedha
 * @version $Id: OnboardingUser.java, v 0.1 2019-03-16 10:39 AM sumedha Exp $$
 */
public class OnboardingUser implements Onboarding {

    List<User> users = new ArrayList<>();
    HashMap<String, User> userHashMap = new HashMap<>();

    //HashMap<String, ArrayList<Vehicle>> userVehicleHashMap = new HashMap<>();

    @Override
    public String add_user(String name, String sex, int age) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.setId(name+"_"+age+"_"+sex);

        users.add(user);
        userHashMap.put(user.getId(), user);
        return user.getId();
    }

    public void add_vehicle(String userId, String driverName, String vehicleName, String vehicleNumber) {
        Vehicle vehicle = new Vehicle();
        vehicle.setUserId(userId);
        vehicle.setDriverName(driverName);
        vehicle.setVehicleName(vehicleName);
        vehicle.setVehicleNumber(vehicleNumber);


        if(null != userHashMap.get(userId) && null != userHashMap.get(userId).getVehicleList()) {
            userHashMap.get(userId).getVehicleList().add(vehicle);
        }
        /*ArrayList<Vehicle> vehicles = userVehicleHashMap.get(userId);
        if(null == vehicles || vehicles.isEmpty()) {
            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(vehicle);
            userVehicleHashMap.put(userId,vehicleList);
        } else {
            vehicles.add(vehicle);
            userVehicleHashMap.put(userId, vehicles);
        }*/

    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public HashMap<String, User> getUserHashMap() {
        return userHashMap;
    }

    public void setUserHashMap(HashMap<String, User> userHashMap) {
        this.userHashMap = userHashMap;
    }
}