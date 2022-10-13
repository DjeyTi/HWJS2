/**
 * Еда
 */
public class Food extends Product {
    protected String exp_date;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param exp_date - Срок годности
     */
    public Food(String name, int price, int amount, String measurement, String exp_date) {
        super(name, price, amount, measurement);
        this.exp_date = exp_date;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Срок годности: %s.", 
        name, price, amount, measurement, exp_date);
    }
}
/**
 * Хлеб
 */
class Bread extends Food {
    private String type;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param exp_date - Срок годности
     * @param type - Тип хлеба
     */
    Bread(String name, int price, int amount, String measurement, String exp_date, String type) {
        super(name, price, amount, measurement, exp_date);
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Срок годности: %s, Тип хлеба: %s.", 
        name, price, amount, measurement, exp_date, type);
    }
}
/**
 * 
 */
class Egg extends Food {
    private int bulk;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param exp_date - Срок годности
     * @param bulk - Кол-во в упаковке
     */
    Egg(String name, int price, int amount, String measurement, String exp_date, int bulk) {
        super(name, price, amount, measurement, exp_date);
        this.bulk = bulk;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Срок годности: %s, Кол-во в упаковке: %d.", 
        name, price, amount, measurement, exp_date, bulk);
    }
}