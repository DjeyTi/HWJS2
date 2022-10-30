package HW5.Calc;

import java.io.IOException;
import java.util.Scanner;

class Menu {
    Menu() {
    }

    void ButtonClick() throws IOException {
        Scanner in = new Scanner(System.in);
        Logger log = new Logger();
        System.out.println("Добро пожаловать в калькулятор, выберите метод, который вы желаете выполнить: ");
        System.out.println("sum - Сложение        sub - Вычитание");
        System.out.println("div - Деление         mult - Умножение\n");
        String method = in.nextLine();
        System.out.println("Введите первое значение: ");
        String enter = in.nextLine();
        Boolean check = true;
        String type = null;
        Object arg1 = null;
        if (!enter.contains("i")) {
            arg1 = Double.parseDouble(enter);
            check = false;
        } else {
            arg1 = enter;
        }
        if (check) {
            type = "Complex";
        } else {
            type = "Irrational";
        }
        log.writeOperandum(method, type);
        System.out.println("Введите второе значение: ");
        enter = in.nextLine();
        Object arg2 = null;
        if (!enter.contains("i")) {
            arg2 = Double.parseDouble(enter);
        } else {
            arg2 = enter;
        }
        if (method.contains("sum")) {
            if (type.contains("Irrational"))
                System.out.println("Ответ: " + new Sum(arg1, arg2).result((Double) arg1,(Double) arg2));
            else
                System.out.println("Ответ: " + new Sum(arg1, arg2).result((String) arg1,(String) arg2));
        } else if (method.contains("sub")) {
            if (type.contains("Irrational"))
                System.out.println("Ответ: " + new Sub(arg1, arg2).result((Double) arg1,(Double) arg2));
            else
                System.out.println("Ответ: " + new Sub(arg1, arg2).result((String) arg1,(String) arg2));
        } else if (method.contains("div")) {
            if (type.contains("Irrational"))
                System.out.println("Ответ: " + new Div(arg1, arg2).result((Double) arg1,(Double) arg2));
            else
                System.out.println("Ответ: " + new Div(arg1, arg2).result((String) arg1,(String) arg2));
        } else if (method.contains("mult")) {
            if (type.contains("Irrational"))
                System.out.println("Ответ: " + new Mult(arg1, arg2).result((Double) arg1,(Double) arg2));
            else
                System.out.println("Ответ: " + new Mult(arg1, arg2).result((String) arg1,(String) arg2));
        }
        in.close();
    }
}
