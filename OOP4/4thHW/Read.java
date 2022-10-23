import java.io.*;

public class Read {
    String path;
    
    public Read(String path) {
        this.path = path;
    }

    public Object getMessage() throws IOException {
        FileReader file = new FileReader(this.path);
        char [] i = new char[100];
        file.read(i);
        StringBuilder sb0 = new StringBuilder();
        boolean check = false;
        int skip = 0;
        for (char j: i) {
            if (j == '"')
                continue;
            if (j == ':')
                break;
            if (check)
                sb0.append(j);
            if (j == '{')
                check = true;
        }
        String type = sb0.toString();
        type = type.trim();
        StringBuilder sb = new StringBuilder();
        check = false;
        boolean StrCheck = false;
        skip = 0;
        if (type.matches("Cat")) {
            int count = 0;
            Object[] arg = new Object[2];
            int number = 0;
            for (char j: i) {
                if (j == '"')
                    continue;
                if (j == ':')
                    count++;
                if (j == ',' ^ j == '}' & check) {
                    check = false;
                    count = 1;
                    if (number == 0) {
                        type = sb.toString();
                        type = type.trim();
                        type.substring(1, type.length() - 2);
                        arg[0] = type;
                        number++;
                        sb.replace(0, sb.length(), "");
                    } else if (number == 1) {
                        type = sb.toString();
                        arg[1] = Integer.parseInt(type.trim());  
                    }
                }
                if (check)
                    sb.append(j);
                if (count > 1)
                    check = true;
            }
            file.close();
            Cat cat = new Cat(arg[0], arg[1]);
            return cat;
        } else {
            Object arg;
            for (char j: i) {
                if (j == '}')
                    check = false;
                if (check & skip < 2) {
                    if (j == '"') {
                        StrCheck = true;
                        skip++;
                        continue;
                    } else {
                        sb.append(j);
                    }
                }
                if (j == ':')
                    check = true;
            }
            if (StrCheck != true) {
                String parsing = sb.toString();
                arg = Integer.parseInt(parsing.trim());
            } else {
                arg = sb.toString();
            }
            file.close();
            return arg;
        }
    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Cat(Object name, Object age) {
        this.name = (String) name;
        this.age = (int) age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Лет: %d", name, age); 
    }
}
