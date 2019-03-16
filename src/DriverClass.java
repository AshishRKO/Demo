/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.List;

/**
 * @author sumedha
 * @version $Id: DriverClass.java, v 0.1 2019-03-16 10:29 AM sumedha Exp $$
 */
public class DriverClass {



    public static void main(String[] args) {

        Onboarding onboarding = new OnboardingUser();
        onboarding.add_user("Rohan", "M", 36);
        onboarding.add_vehicle("Rohan_36_M", "Rohan", "Swift", "KA-01-12345");

        onboarding.add_user("Shashank", "M", 29);
        onboarding.add_vehicle("Shashank_29_M", "Shashank", "Baleno", "TS-05-62395");

        onboarding.add_user("Nandini", "F", 29);

        onboarding.add_user("Shipra", "F", 27);
        onboarding.add_vehicle("Shipra_27_F", "Shipra", "Polo", "KA-05-41491");
        onboarding.add_vehicle("Shipra_27_F", "Shipra", "Scooty", "KA-12-12332");

        onboarding.add_user("Gaurav", "M", 29);

        List<User> users = ((OnboardingUser) onboarding).getUsers();
        for (User user :
                users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getSex() + " " + user.getAge());
            for (Vehicle vehicle:
                 user.getVehicleList()) {
                System.out.println("Vehicle -> " + vehicle.getDriverName() + " " + vehicle.getVehicleName() + " " + vehicle.getVehicleNumber());
            }
        }


    }
}