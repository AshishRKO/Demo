/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: RideTourMap.java, v 0.1 2019-03-16 11:08 AM Ashish Barthwal $$
 */
public class RideTourMap {

    private String source;
    private String destination;

    public RideTourMap(String source, String destination) {
        this.source = source;
        this.destination = destination;
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


    @Override
    public String toString() {
        return "\nRideTourMap{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}