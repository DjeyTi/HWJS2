public abstract class Bird extends Zoo implements Animal{
    protected int high;

    public void fly() {
        System.out.println("Я лечу на " + this.high + " метрах");
    }

    protected void setHigh(int high) {
        this.high = high;
    }
}
/**
 * Курица
 */
class Chicken extends Bird {
    /**
     * 
     * @param high - Высота полёта
     */
    public Chicken(int high) {
        setHigh(high);
    }

    @Override
    public void getSound() {
        System.out.println("Quack");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye);
    }
}
/**
 * Аист
 */
class Stork extends Bird {
    /**
     * 
     * @param high - Высота полёта
     */
    public Stork(int high) {
        setHigh(high);
    }

    @Override
    public void getSound() {
        System.out.println("*Звук аиста*");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye);
    }
}