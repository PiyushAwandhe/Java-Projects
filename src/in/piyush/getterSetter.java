package in.piyush;

public class getterSetter {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public getterSetter(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
        
    }

    public  String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
        if (color.equals("Yellow")){
            System.out.println("Chiiii");
        }else {
            this.color = color;
        }

    }

    public String getModel() {
        return model;
    }


}
