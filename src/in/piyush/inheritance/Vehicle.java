package in.piyush.inheritance;

public class Vehicle {
    private int noOfWheels;

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void commute(){
        System.out.printf("I am going from place A to B using %d wheelers \n", noOfWheels);
    }

}

