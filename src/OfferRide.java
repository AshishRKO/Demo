
import java.util.Date;


public class OfferRide {

    private String driverName;
    private String source;
    private int avaialbleSeats;
    private String vehicle;
    private String destination;


    private Date startTime;

    private String duration;


    public OfferRide(String driverName, String source, int seats, String vehicle, String destination, Date startTime, String duration) {
        this.driverName = driverName;
        this.source = source;
        this.avaialbleSeats = seats;
        this.vehicle = vehicle;
        this.destination = destination;
        this.startTime = startTime;
        this.duration = duration;
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
     * Getter method for property <tt>source</tt>.
     *
     * @return property value of source
     */
    public String getSource() {
        return source;
    }

    /**
     * Setter method for property <tt>source</tt>.
     *
     * @param source value to be assigned to property source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter method for property <tt>destination</tt>.
     *
     * @return property value of destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Setter method for property <tt>destination</tt>.
     *
     * @param destination value to be assigned to property destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Getter method for property <tt>seats</tt>.
     *
     * @return property value of seats
     */
    public int getAvaialbleSeats() {
        return avaialbleSeats;
    }

    /**
     * Setter method for property <tt>seats</tt>.
     *
     * @param seats value to be assigned to property seats
     */
    public void setAvaialbleSeats(int seats) {
        this.avaialbleSeats = seats;
    }

    /**
     * Getter method for property <tt>vehicle</tt>.
     *
     * @return property value of vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for property <tt>vehicle</tt>.
     *
     * @param vehicle value to be assigned to property vehicle
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Getter method for property <tt>startTime</tt>.
     *
     * @return property value of startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Setter method for property <tt>startTime</tt>.
     *
     * @param startTime value to be assigned to property startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter method for property <tt>duration</tt>.
     *
     * @return property value of duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Setter method for property <tt>duration</tt>.
     *
     * @param duration value to be assigned to property duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "\n OfferRide{" +
                "driverName='" + driverName + '\'' +
                ", source='" + source + '\'' +
                ", avaialbleSeats=" + avaialbleSeats +
                ", vehicle='" + vehicle + '\'' +
                ", destination='" + destination + '\'' +
                ", startTime=" + startTime +
                ", duration='" + duration + '\'' +
                '}';
    }
}