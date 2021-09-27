public class Car implements Tradable, Drivable {
    private String colour;
    private int maxSpeed;

    public Car(String colour) {
        this.colour = colour;
    }

    public Car() {
        this.colour = "Black";
        this.maxSpeed = 100;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour(){
        return this.colour;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +"\n Colour:" + this.colour + ")";
    }
}
