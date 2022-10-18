/**
 * Детские товары
 */
public class Child extends Product {
    protected int age;
    protected String hypoallergenic;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param age - Минимальный возраст
     * @param hypoallergenic - Гипоаллергенность
     */
    public Child(String name, int price, int amount, String measurement, int age, String hypoallergenic) {
        super(name, price, amount, measurement);
        this.age = age;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Минимальный возраст: %d лет, Гипоаллергенность: %s", 
        name, price, amount, measurement, age, hypoallergenic);
    }
}
/**
 * Под гузно
 */
class Diaper extends Child {
    private String size;
    private int min_weight;
    private int max_weight;
    private String type;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param age - Минимальный возраст
     * @param hypoallergenic - Гипоаллергенность
     * @param size - Размер (S, M ...)
     * @param min_weight - Мин. Вес
     * @param max_weight - Макс. Вес
     * @param type - Тип
     */
    Diaper(String name, int price, int amount, String measurement, int age, String hypoallergenic, String size, int min_weight,
           int max_weight, String type) {
        super(name, price, amount, measurement, age, hypoallergenic);
        this.size = size;
        this.min_weight = min_weight;
        this.max_weight = max_weight;
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Минимальный возраст: %d лет, Гипоаллергенность: %s, Размер: %s, Минимальный вес: %d кг, Максимальный вес: %d кг, Тип: %s.", 
        name, price, amount, measurement, age, hypoallergenic, size, min_weight, max_weight, type);
    }
}
/**
 * Соска
 */
class Dummy extends Child {
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param age - Минимальный возраст
     * @param hypoallergenic - Гипоаллергенность
     */
    Dummy(String name, int price, int amount, String measurement, int age, String hypoallergenic) {
        super(name, price, amount, measurement, age, hypoallergenic);
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Минимальный возраст: %d лет, Гипоаллергенность: %s", 
        name, price, amount, measurement, age, hypoallergenic);
    }
}