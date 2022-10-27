package HW5.Job;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Info first = new Info();
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в меню управлении ИСУС (Информационной Системы Управлении Сотрудниками)\nПрошу, введите команду");
        System.out.println("Добавить нового сотрудника: -a\nУдалить существующего сотрудника: -r");
        System.out.println("Посмотреть информацию сотрудника: -v\nПосмотреть информацию всех сотрудников: -c");
        System.out.println("Очистить весь список сотрудниов: -p\n");
        String command = in.nextLine();
        if (command.contains("-a")) {
            System.out.println("Введите данные сотрудника\nID: ");
            String ID = in.nextLine();
            System.out.println("ФИО: ");
            String name = in.nextLine();
            System.out.println("Дата рождения: ");
            String DoB = in.nextLine();
            System.out.println("З/п: ");
            String payment = in.nextLine();
            first.addNewInfo(new Worker(ID, name, DoB, payment));
            System.out.println("Сотрудник добавлен");
        } else if (command.contains("-r")) {
            System.out.println("Введите данные сотрудника\nID: ");
            String ID = in.nextLine();
            first.removeWorker(ID);
            System.out.println("Сотрудник удалён");
        } else if (command.contains("-v")) {
            System.out.println("Введите данные сотрудника\nID: ");
            String ID = in.nextLine();
            first.getOneInfo(ID);
        } else if (command.contains("-c")) {
            first.getAllInfo();
        } else if (command.contains("-p")) {
            first.removeAllWorkers();
            System.out.println("Список очищен");
        } else {
            System.out.println("Неверная команда");
        }
        in.close();
    }
}