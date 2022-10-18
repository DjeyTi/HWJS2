/**
 * Напиток
 */
public class Drink extends Product {
    protected double size;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param size - Объём в литрах
     */
    public Drink(String name, int price, int amount, String measurement, double size) {
        super(name, price, amount, measurement);
        this.size = size;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Объём: %f л.", 
        name, price, amount, measurement, size);
    }
}
/**
 * Молоко
 */
class Milk extends Drink {
    private double fat;
    private String exp_date;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param size - Объём в литрах
     * @param fat - Жирность
     * @param exp_date - Срок годности
     */
    Milk(String name, int price, int amount, String measurement, double size, double fat, String exp_date) {
        super(name, price, amount, measurement, size);
        this.fat = fat;
        this.exp_date = exp_date;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Срок годности: %s, Жирность: %f процентов, Объём: %f л.", 
        name, price, amount, measurement, exp_date, fat, size);
    }

    public void changeExp(String exp_date) {
        this.exp_date = exp_date;
    }
}
/**
 * Лимонад
 */
class Lemonade extends Drink {
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param size - Объём в литрах
     */
    Lemonade(String name, int price, int amount, String measurement, int size) {
        super(name, price, amount, measurement, size);
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Объём: %f л.", 
        name, price, amount, measurement, size);
    }
}