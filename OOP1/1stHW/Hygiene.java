/**
 * Напиток
 */
public class Hygiene extends Product {
    protected int piece;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param piece - Количество в шт.
     */
    public Hygiene(String name, int price, int amount, String measurement, int piece) {
        super(name, price, amount, measurement);
        this.piece = piece;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Количество: %d шт.", 
        name, price, amount, measurement, piece);
    }
}
/**
 * Маски медицинские
 */
class Mask extends Hygiene {
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param piece - Количество в шт.
     */
    Mask(String name, int price, int amount, String measurement, int piece) {
        super(name, price, amount, measurement, piece);
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Количество: %d шт.", 
        name, price, amount, measurement, piece);
    }
}
/**
 * Туалетная бумага
 */
class TP extends Hygiene {
    private int layer;
    /**
     * 
     * @param name - Название
     * @param price - Цена
     * @param amount - Количество
     * @param measurement - Единица измерения
     * @param piece - Количество в шт.
     * @param layer - Слои
     */
    TP(String name, int price, int amount, String measurement, int piece, int layer) {
        super(name, price, amount, measurement, piece);
        this.layer = layer;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d руб., На складе: %d, Измеряется: %s, Количество: %d шт., Слоёв: %d", 
        name, price, amount, measurement, piece, layer);
    }
}