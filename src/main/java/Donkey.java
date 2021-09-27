public class Donkey implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Donkey(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public Donkey() {
        this.maxSpeed = 2;
    }

    @Override
    public String sound() {
        return "Hee-Haw!!!!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed * 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 4;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
