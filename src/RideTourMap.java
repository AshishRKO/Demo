
import java.util.Objects;


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RideTourMap)) return false;
        RideTourMap that = (RideTourMap) o;
        return Objects.equals(getSource(), that.getSource()) &&
                Objects.equals(getDestination(), that.getDestination());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSource(), getDestination());
    }

    @Override
    public String toString() {
        return "\nRideTourMap{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}