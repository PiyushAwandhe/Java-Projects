package in.piyush;

public class accessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "BMW";
        System.out.println(car);

        Car newCar = new Car("Black", "Audi", 1,10000);

        System.out.println(newCar);
    }
}
