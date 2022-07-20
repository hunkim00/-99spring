import java.util.UUID;

public class Main {
    String name;
    String status;
    String num;
    int speed;
    int maxspeed;
    int fuel;
    int customer;
    int maxcustomer;
    int price;
    int distance;

    public Main(String name, String status, String num, int speed, int fuel, int customer, int maxcustomer) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;
        this.customer = customer;
        this.maxcustomer = maxcustomer;
    }

    public Main(String name, String status, String num, int speed, int maxspeed, int fuel, int customer, int maxcustomer, int price, int distance) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.maxspeed = maxspeed;
        this.fuel = fuel;
        this.customer = customer;
        this.maxcustomer = maxcustomer;
        this.price = price;
        this.distance = distance;
    }

    public Main(String name, String status, String num, int speed, int fuel) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;

    }

    protected void printMyCar() {
        System.out.println("This car is " + name);
    }


    public static void main(String[] args) {
        Bus bus = new Bus("Bus1", "운행", UUID.randomUUID().toString(), 0, 100, 2, 30);
        Taxi taxi = new Taxi("taxi", "운행불가", UUID.randomUUID().toString(), 0, 120, 100, 0, 4, 5000, 0);
        System.out.println(bus.name);
        System.out.println(bus.num);
        System.out.println(bus.customer);
        System.out.println(bus.maxcustomer);
        System.out.println(taxi.name);
        System.out.println(taxi.speed);
        System.out.println(taxi.maxspeed);
        System.out.println(taxi.fuel);
        System.out.println(taxi.customer);
        System.out.println(taxi.maxcustomer);
        System.out.println(taxi.price);
        System.out.println(taxi.distance);
    }
}