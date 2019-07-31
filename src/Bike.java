public class Bike implements Transport {
    private int numberOfWheels;
    private String color;
    private String drivingForce;

    public Bike() {
        this.numberOfWheels = 2;
        this.color = "default";
        this.drivingForce = "petrol";
    }

    public Bike(int numberOfWheels, String color, String drivingForce) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.drivingForce = drivingForce;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDrivingForce() {
        return drivingForce;
    }

    public void setDrivingForce(String drivingForce) {
        this.drivingForce = drivingForce;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void drive() {
        System.out.println("I'm riding a bike");
    }
}
