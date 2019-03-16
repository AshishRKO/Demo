/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author sumedha
 * @version $Id: OnboardingUser.java, v 0.1 2019-03-16 10:37 AM sumedha Exp $$
 */
public abstract class Onboarding {

    abstract String add_user(String name, String sex, int age);

    abstract void add_vehicle(String userId, String driverName, String vehicleName, String vehicleNumber);
}