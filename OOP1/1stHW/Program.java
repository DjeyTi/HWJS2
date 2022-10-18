public class Program {
    public static void main(String[] args) {
        Product Heinz = new Product("Heinz", 128, 50, "Упаковка");
        System.out.println(Heinz);
        Food Tuc = new Food("Tuc", 41, 120, "Упаковка", "21.11.24");
        System.out.println(Tuc);
        Bread Black = new Bread("Чёрный хлеб", 28, 200, "Батон", "01.01.23", "Ржаной");
        System.out.println(Black);
        Egg Chicken = new Egg("Куринное яйцо", 32, 360, "Упаковка", "19.07.24", 10);
        System.out.println(Chicken);
        Drink Red_Bull = new Drink("Red Bull", 170, 100, "Банка", 0.5);
        System.out.println(Red_Bull);
        Milk Parmalat = new Milk("Parmalat", 100, 150, "Упаковка", 1, 1.5, "07.12.23");
        System.out.println(Parmalat);
        Lemonade Chernogolovka = new Lemonade("Напиток из Черноголовки", 68, 60, "Бутылка", 1);
        System.out.println(Chernogolovka);
        Hygiene Soap = new Hygiene("Мыло", 27, 150, "Кусок", 1);
        System.out.println(Soap);
        TP Paper = new TP("Туалетная бумага", 19, 200, "Рулон", 1, 2);
        System.out.println(Paper);
        Mask Mask = new Mask("Медецинская маска", 5, 300, "Упаковка", 5);
        System.out.println(Mask);
        Child Toy = new Child("Игрушка", 61, 80, "Штука", 2, "Да");
        System.out.println(Toy);
        Diaper Huggies = new Diaper("Huggies", 100, 50, "Упаковка", 0, "Да", "S", 5, 10, "Ткань");
        System.out.println(Huggies);
        Dummy Dummy = new Dummy("Соска", 32, 40, "Штука", 0, "Да");
        Dummy.changePrice(39);
        Dummy.changeAmount(20);
        System.out.println(Dummy);
    }
}