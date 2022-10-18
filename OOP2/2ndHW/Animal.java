public interface Animal {
    // int height = 0;                     // Код ревью: Все значения в интерфейсах не являются константами в реальных условиях
    // int weight = 0;                     // поэтому их нужно имплемитировать либо в существующие классы
    // String eye = null;                  // либо создавать новый классы, которые будут это иметь

    void getSound();

    void getInfo();
}

interface HouseAnimal extends Animal {
    // String name = "Name";
    // String breed = "Breed";
    // String Vacсin = "Vaccin";
    // String hairColor = "HairColor";
    // String DoB = "DoB";

    void endearment();
    
}

interface WildAnimal extends Animal {
    // static String habitat = "";
    // static String DoF = "";
}

class AnimalInfo {
    int height;                     
    int weight;                     
    String eye; 
    String name;
    String breed;
    String Vacсin;
    String hairColor;
    String DoB;
    static String habitat;
    static String DoF;
}
