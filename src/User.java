/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: User.java, v 0.1 2019-03-16 10:21 AM Ashish Barthwal $$
 */
public class User {

    private String name;
    private String gender;
    private int age;

    private boolean isDriver;
    private boolean isPassenger;

    public User(String name, String gender, int age, boolean isDriver, boolean isPassenger) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.isDriver = isDriver;
        this.isPassenger = isPassenger;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     *
     * @return property value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>isDriver</tt>.
     *
     * @return property value of isDriver
     */
    public boolean isDriver() {
        return isDriver;
    }

    /**
     * Setter method for property <tt>driver</tt>.
     *
     * @param driver value to be assigned to property driver
     */
    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    /**
     * Getter method for property <tt>isPassenger</tt>.
     *
     * @return property value of isPassenger
     */
    public boolean isPassenger() {
        return isPassenger;
    }

    /**
     * Setter method for property <tt>passenger</tt>.
     *
     * @param passenger value to be assigned to property passenger
     */
    public void setPassenger(boolean passenger) {
        isPassenger = passenger;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", isDriver=" + isDriver +
                ", isPassenger=" + isPassenger +
                '}';
    }
}