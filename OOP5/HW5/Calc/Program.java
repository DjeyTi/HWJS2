package HW5.Calc;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Logger Job = new Logger();
        Object arg1 = null;
        Object arg2 = null;
        System.out.print("Введите первое число: ");
        arg1 = in.nextLine();
        if (!((String) arg1).contains("i")) {
            arg1 = Double.parseDouble((String) arg1);
        }
        System.out.print("Введите второе число: ");
        arg2 = in.nextLine();
        if (!((String) arg2).contains("i")) {
            arg2 = Double.parseDouble((String) arg2);
        }
        System.out.print("Введите метод: ");
        String m = in.nextLine();
        Job.writeOperandum(m);
        if (m.contains("Sum")) {
            Sum answer = new Sum(arg1, arg2);
            System.out.println(answer.result());           
        } else if (m.contains("Sub")) {
            Sub answer = new Sub(arg1, arg2);   
            System.out.println(answer.result());  
        } else if (m.contains("Div")) {
            Div answer = new Div(arg1, arg2);   
            System.out.println(answer.result());  
        } else if (m.contains("Mult")) {
            Mult answer = new Mult(arg1, arg2);   
            System.out.println(answer.result());  
        }
        in.close();
    }
}