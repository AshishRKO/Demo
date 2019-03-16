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
public class OnboardingUser extends Onboarding {

    List<User> users = new ArrayList<>();
    HashMap<Integer, Vehicle> userVehicleHashMap = new HashMap<>();

    @Override
    String add_user(String name, boolean sex, int age) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.setId(name+"_"+age+"_"+sex);

        users.add(user);
        return user.getId();
    }


}