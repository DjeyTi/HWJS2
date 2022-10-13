/**
 * Продукт
 */
public class Product {
    protected String name;
    protected int price;
    protected int amount;
    protected String measurement;
    /**
     * 
     * @param name - Название продукта
     * @param price - Его цена
     * @param amount - Количество на складе
     * @param measurement - Единица измерения продукта
     */
    public Product(String name, int price, int amount, String measurement) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.measurement = measurement;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s.", name, price, amount, measurement);
    }
}