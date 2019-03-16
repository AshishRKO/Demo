/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: RideBooking.java, v 0.1 2019-03-16 10:54 AM Ashish Barthwal $$
 */
public class RideBooking {

    private String bookerName;
    private String source;
    private String destination;
    private int seats;
    private SelectionStrategy selectionStrategy;

    public RideBooking(String bookerName, String source, String destination, int seats, SelectionStrategy selectionStrategy) {
        this.bookerName = bookerName;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.selectionStrategy = selectionStrategy;
    }

    /**
     * Getter method for property <tt>bookerName</tt>.
     *
     * @return property value of bookerName
     */
    public String getBookerName() {
        return bookerName;
    }

    /**
     * Setter method for property <tt>bookerName</tt>.
     *
     * @param bookerName value to be assigned to property bookerName
     */
    public void setBookerName(String bookerName) {
        this.bookerName = bookerName;
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
    public int getSeats() {
        return seats;
    }

    /**
     * Setter method for property <tt>seats</tt>.
     *
     * @param seats value to be assigned to property seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * Getter method for property <tt>selectionStrategy</tt>.
     *
     * @return property value of selectionStrategy
     */
    public SelectionStrategy getSelectionStrategy() {
        return selectionStrategy;
    }

    /**
     * Setter method for property <tt>selectionStrategy</tt>.
     *
     * @param selectionStrategy value to be assigned to property selectionStrategy
     */
    public void setSelectionStrategy(SelectionStrategy selectionStrategy) {
        this.selectionStrategy = selectionStrategy;
    }



    @Override
    public String toString() {
        return "\nRideBooking{" +
                "bookerName='" + bookerName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", seats=" + seats +
                ", selectionStrategy=" + selectionStrategy +
                '}';
    }
}