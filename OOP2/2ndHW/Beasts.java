/**
 * Кот
 */
class Cat extends Zoo implements HouseAnimal {
    private String hair;
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
     * @param hair - Присутсвует шерсть?
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param name - Кличка
     * @param breed - Порода
     * @param Vacсin - Вакцинирован?
     * @param hairColor - Цвет шерсти
     * @param DoB - Дата рождения
     */
    public Cat(String hair, int height, int weight, String eye, String name, String breed, String Vacсin, String hairColor, String DoB) {
        this.hair = hair;
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.name = name;
        this.breed = breed;
        this.Vacсin = Vacсin;
        this.hairColor = hairColor;
        this.DoB = DoB;
    }

    public void getHair() {
        System.out.println(hair);
    }

    @Override
    public void getSound() {
        System.out.println("Meow");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nКличка: " + name
                           + "\nПорода: " + breed + "\nПривит: " + Vacсin + "\nЦвет шерсти: " + hairColor + "\nДата рождения: " + DoB);
    }

    @Override
    public void endearment() {
        System.out.println(name + " проявляет ласку!");
    }
}
/**
 * Тигр
 */
class Tiger extends Zoo implements WildAnimal {
    private int height;                     
    private int weight;                     
    private String eye;
    private String habitat;
    private String DoF; 
    /**
     * 
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param habitat - Ареал обитания
     * @param DoF - Дата находки
     */
    Tiger(int height, int weight, String eye, String habitat, String DoF) {
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.habitat = habitat;
        this.DoF = DoF;
    }

    @Override
    public void getSound() {
        System.out.println("Rraaww");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nАреал ообитания: " + habitat 
                           + "\nДата нахождения: " + DoF); 
    }
}
/**
 * Пёс
 */
class Dog extends Zoo implements HouseAnimal {
    private String trained;
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
     * @param trained - Тренирован?
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param name - Кличка
     * @param breed - Порода
     * @param Vacсin - Вакцинирован?
     * @param hairColor - Цвет шерсти
     * @param DoB - Дата рождения
     */
    Dog(String trained, int height, int weight, String eye, String name, String breed, String Vacсin, String hairColor, String DoB) {
        this.trained = trained;
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.name = name;
        this.breed = breed;
        this.Vacсin = Vacсin;
        this.hairColor = hairColor;
        this.DoB = DoB;        
    }

    public void getTrained() {
        System.out.println(trained);
    }   

    @Override
    public void getSound() {
        System.out.println("Woof");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nКличка: " + name
                           + "\nПорода: " + breed + "\nПривит: " + Vacсin + "\nЦвет шерсти: " + hairColor + "\nДата рождения: " + DoB);
    }

    @Override
    public void endearment() {
        System.out.println(name + " проявляет ласку!");
    }    
}
/**
 * Волк
 */
class Wolf extends Zoo implements WildAnimal {
    private String alfa;
    private int height;                     
    private int weight;                     
    private String eye;
    private String habitat;
    private String DoF; 
    /**
     * 
     * @param alfa - Вожак?
     * @param height - Высота
     * @param weight - Вес
     * @param eye - Цвет глаз
     * @param habitat - Ареал обитания
     * @param DoF - Дата находки
     */
    public Wolf(String alfa, int height, int weight, String eye, String habitat, String DoF) {
        this.alfa = alfa;
        this.height = height;
        this.weight = weight;
        this.eye = eye;
        this.habitat = habitat;
        this.DoF = DoF;
    }

    public void getAlfa() {
        System.out.println(alfa);
    }

    @Override
    public void getSound() {
        System.out.println("Rrrrr");
    }

    @Override
    public void getInfo() {
        System.out.println("Рост: " + height + "\nВес: " + weight + "\nЦвет глаз: " + eye + "\nАреал ообитания: " + habitat 
                           + "\nДата нахождения: " + DoF + "\nВожак стаи: " + alfa);       
    }
}