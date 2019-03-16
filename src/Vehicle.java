
public abstract class Vehicle {
    private String driverName;
    private String carName;
    private String licenseNumber;

    private int passengerCapacity;


    public Vehicle(String driverName, String carName, String licenseNumber, int passengerCapacity) {
        this.driverName = driverName;
        this.carName = carName;
        this.licenseNumber = licenseNumber;
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * Getter method for property <tt>driverName</tt>.
     *
     * @return property value of driverName
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Setter method for property <tt>driverName</tt>.
     *
     * @param driverName value to be assigned to property driverName
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * Getter method for property <tt>carName</tt>.
     *
     * @return property value of carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Setter method for property <tt>carName</tt>.
     *
     * @param carName value to be assigned to property carName
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * Getter method for property <tt>licenseNumber</tt>.
     *
     * @return property value of licenseNumber
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Setter method for property <tt>licenseNumber</tt>.
     *
     * @param licenseNumber value to be assigned to property licenseNumber
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * Getter method for property <tt>passengerCapacity</tt>.
     *
     * @return property value of passengerCapacity
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Setter method for property <tt>passengerCapacity</tt>.
     *
     * @param passengerCapacity value to be assigned to property passengerCapacity
     */
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "driverName='" + driverName + '\'' +
                ", carName='" + carName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}