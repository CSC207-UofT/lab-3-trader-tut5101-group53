public class Cat implements Domesticatable, Tradable{

    public Cat(){
        int maxSpeed = 7;
    }

    @Override
    public String sound() {
        return "Meoww!";}

    @Override
    public int getPrice() {
        return 50;}

    public int getSpeed() {
        return 7;}


}