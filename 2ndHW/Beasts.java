/**
 * Кот
 */
class Cat extends Zoo implements HouseAnimal {
    private String hair;
    /**
     * 
     * @param hair - Есть шерсть или нет
     */
    public Cat(String hair) {
        this.hair = hair;
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

    Tiger() {   //Вообще, каков смысл от этого
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
    /**
     * 
     * @param trained - Тренирован?
     */
    Dog(String trained) {
        this.trained = trained;        
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
    /**
     * 
     * @param alfa - Вожак?
     */
    public Wolf(String alfa) {
        this.alfa = alfa;
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
                           + "\nДата нахождения: " + DoF);       
    }
}