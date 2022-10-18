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
class Chicken extends Bird implements HouseAnimal {
    private int height;                     
    private int weight;                     
    private String eye; 
    private String name;
    private String breed;
    private String Vacсin;
    private String hairColor;
    private String DoB;
    /**
     * 
     * @param high - Высота полёта
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param name - Кличка
     * @param breed - Порода
     * @param Vacсin - Вакцинирован?
     * @param hairColor - Цвет шерсти
     * @param DoB - Дата рождения
     */
    public Chicken(int high, int height, int weight, String eye, String name, String breed, String Vacсin, String hairColor, String DoB) {
        setHigh(high);
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.name = name;
        this.breed = breed;
        this.Vacсin = Vacсin;
        this.hairColor = hairColor;
        this.DoB = DoB;
    }

    @Override
    public void getSound() {
        System.out.println("Quack");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nКличка: " + name
        + "\nПорода: " + breed + "\nПривит: " + Vacсin + "\nЦвет шерсти: " + hairColor + "\nДата рождения: " + DoB);
    }

    @Override
    public void endearment() {
        System.out.println(name + " кудахчет!");
    }
}
/**
 * Аист
 */
class Stork extends Bird {
    private int height;                     
    private int weight;                     
    private String eye;
    private String habitat;
    private String DoF; 
    /**
     * 
     * @param high - Высота полёта
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param habitat - Ареал обитания
     * @param DoF - Дата находки
     */
    public Stork(int high, int height, int weight, String eye, String habitat, String DoF) {
        setHigh(high);
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.habitat = habitat;
        this.DoF = DoF;
    }

    @Override
    public void getSound() {
        System.out.println("*Звук аиста*");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nАреал ообитания: " + habitat 
        + "\nДата нахождения: " + DoF);
    }
}