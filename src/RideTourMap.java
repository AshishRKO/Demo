/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.Objects;

/**
 * @author Ashish Barthwal
 * @version $Id: RideTourMap.java, v 0.1 2019-03-16 11:08 AM Ashish Barthwal $$
 */
public class RideTourMap {

    private String source;
    private String destination;
    private String name;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RideTourMap)) return false;
        RideTourMap that = (RideTourMap) o;
        return Objects.equals(getSource(), that.getSource()) &&
                Objects.equals(getDestination(), that.getDestination()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSource(), getDestination(), getName());
    }

    @Override
    public String toString() {
        return "\nRideTourMap{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}