public class Main {
    Admin admin = new Admin();

    public void test1(){

        admin.addUser(new User("Rohan", "M", 36, true, true));
        admin.addVehicle(new Car("Rohan", "Swift", "KA-01-12345", 4));

        admin.addUser(new User("Shashank", "M", 29, true, true));
        admin.addVehicle(new Car("Shashank", "Baleno", "TS-05-62395", 4));


        admin.addUser(new User("Shashank", "M", 29, true, true));


        admin.addUser(new User("Shipra", "F", 27, true, true));
        admin.addVehicle(new Car("Shashank", "Baleno", "TS-05-62395", 4));

        print();
    }

    public void print()
    {
        System.out.println("Users = "+Admin.userList);
        System.out.println("Users = "+Admin.vehicleList);
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.test1();

    }
}
