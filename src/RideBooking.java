/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: RideBooking.java, v 0.1 2019-03-16 10:54 AM Ashish Barthwal $$
 */
public class RideBooking {

    //private String reservationNumber;
    private String source;
    private String destination;

    private int seats;
    private Vehicle vehicle;
    private SelectionStrategy selectionStrategy;

    public RideBooking(String source, String destination, int seats, SelectionStrategy selectionStrategy) {
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.selectionStrategy = selectionStrategy;
    }
}