/**
 * Продукт
 */
public class Product {
    protected String name;                  // Код ревью: Тут есть переменные, которые очень динамичные 
    protected int price;                    // Значение которых может постоянно меняться
    protected int amount;                   // Поэтому можно добавть метод для их изменения, чтобы не создавать один и тот же продукт
    protected String measurement;           // по тысячи раз из-за разницы количества продукта на складе и его цены
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
    
    public void changePrice(int price) {
        this.price = price;
    }

    public void changeAmount(int amount) {
        this.amount = amount;
    }
}