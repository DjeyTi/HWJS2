import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Cat Barsik = new Cat("Да", 1, 8, "Голубые", "Барсик", "Бродяга",
                             "Да", "Голубой", "01.06.18");          // Главные поля, которые помогают в определении 
        Cat Bobik = new Cat("Да", 2, 12, "Голубые", "Боба", "Русский короткошёрстный",
                            "Да", "Голубой", "07.01.18");        // кота в массивах, очередях и стаках
        Chicken Nugget = new Chicken(5, 1, 2, "Чёрные", "Чернушка", "Чёрная",
                                     "Нет", "Чёрная", "28.07.21");
        Nugget.fly();
        Barsik.getInfo();
        Barsik.getSound();
        Barsik.getHair();
        Barsik.endearment();
        Zoo[] First = new Zoo[1];
        First[0] = Barsik;
        First = Zoo.addAnimal(First, 1, Bobik);
        Stack<Zoo> Second = new Stack<Zoo>();
        Second.push(Barsik);
        Second = Zoo.addAnimal(Second, 1, Bobik);
        Queue<Zoo> Third = new LinkedList<Zoo>();
        Third.add(Barsik);
        Third = Zoo.addAnimal(Third, 1, Bobik);
        // Zoo.getAllInfo(First);
        // Zoo.getAllInfo(Second);
        // Zoo.getAllInfo(Third);
        // Zoo.playZooSound(First);
        // Zoo.playZooSound(Second);
        // Zoo.playZooSound(Third);
        First = Zoo.deleteAnimal(First, 2);
        Second = Zoo.deleteAnimal(Second, 2);
        Third = Zoo.deleteAnimal(Third, 2);
        // Zoo.checkAnimal(First, 1);
        // Zoo.checkAnimal(Second, 1);
        // Zoo.checkAnimal(Third, 1);
        // Zoo.getSound(First, 1);
        // Zoo.getSound(Second, 1);
        // Zoo.getSound(Third, 1);
    }
}
