package in.piyush.inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        twoWheeler twoWheeler =  new twoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();


        mototcycle motor = new mototcycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
