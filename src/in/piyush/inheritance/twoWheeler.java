package in.piyush.inheritance;

public class twoWheeler extends Vehicle{
    twoWheeler(){
        setNoOfWheels(2);
    }


    public void balance() {
        System.out.println("Balancing the mototcycle");
    }
}
