public interface Animal {
    int height = 0;
    int weight = 0;
    String eye = null;

    void getSound();

    void getInfo();
}

interface HouseAnimal extends Animal {
    String name = "Name";               // Я не понимаю, зачем?
    String breed = "Breed";             // После объявления констант, мы их не сможем изменить
    String Vacсin = "Vaccin";           // Каков прок от них в этом заданий?
    String hairColor = "HairColor";
    String DoB = "DoB";

    void endearment();
    
}

interface WildAnimal extends Animal {
    static String habitat = "";
    static String DoF = "";
}