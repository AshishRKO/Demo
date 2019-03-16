import java.util.Calendar;
import java.util.Date;

public class Main {
    Admin admin = new Admin();

    public static void main(String[] args) {

        Main main = new Main();
        main.test1();
        main.test3();

    }

    public void test1() {

        admin.addUser(new User("Rohan", "M", 36, true, true));
        admin.addVehicle(new Car("Rohan", "Swift", "KA-01-12345", 4));

        admin.addUser(new User("Shashank", "M", 29, true, true));
        admin.addVehicle(new Car("Shashank", "Baleno", "TS-05-62395", 4));


        admin.addUser(new User("Nandini", "F", 29, true, true));


        admin.addUser(new User("Shipra", "F", 27, true, true));
        admin.addVehicle(new Car("Shipra", "Polo", "KA-05-41491", 4));

        admin.addUser(new User("Gaurav", "M", 29, true, true));

        print();
    }

    public void print() {
        System.out.println("Users = " + Admin.userList);
        System.out.println("Vehicles = " + Admin.vehicleList);
        System.out.println("OfferRises = " + Admin.rideMap);
    }

    public Date getDate(int year, int month, int date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);
        cal.set(Calendar.HOUR_OF_DAY, hour);

        Date date1 = cal.getTime();

        return date1;
    }

    public void test3() {

        Date date1 = getDate(2019, 1, 25, 8);
        admin.offerRide(new OfferRide("Rohan", "Hyderabad", 1, "Swift,KA-01-12345", "Bangalore", date1, "13 hrs"));

        Date date2 = getDate(2019, 1, 29, 18);
        admin.offerRide(new OfferRide("Shipra", "Bangalore", 1, "Scooty,KA-12-12332", "Mysore", date2, "10 hrs"));

        Date date3 = getDate(2019, 1, 30, 18);
        admin.offerRide(new OfferRide("Shipra", "Bangalore", 2, "POLO,KA-05-41491", "Mysore", date3, "4 hrs"));

        Date date4 = getDate(2019, 1, 27, 10);
        admin.offerRide(new OfferRide("Shashank", "Hyderabad", 2, "Baleno,TS-05-62395", "Bangalore", date4, "14 hrs"));



        print();
    }


    public void select_ride(String source, String destination, int seats, SelectionStrategy selectionStrategy) {
        admin.selectRide(new RideBooking(source, destination, seats, selectionStrategy));
    }
}
