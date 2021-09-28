/* A class that implements the Tradable and Drivable interfaces.
 */

public class Honda implements Tradable, Drivable {
    private String color;
    private int maxSpeed;
    private int price;

    public Honda(String color, int maxspeed, int price) {
        this.color = color;
        this.maxSpeed = maxspeed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return (int) this.price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
