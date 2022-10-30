package HW5.Calc;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Logger {
    String path = "HW2/OOP5/HW5/Calc/log.txt";

    Logger() {
        this.path = "HW2/OOP5/HW5/Calc/log.txt";
    }

    void writeOperandum(String arg1, String arg2) throws IOException {
        List<String> list = Files.readAllLines(Path.of(path));
        try (FileWriter writer = new FileWriter(path))
        {
            for (String str: list)
                writer.write(str + "\n");
            writer.write("Operandum: " + arg1 + ", Type of number's: " + arg2 +"\n");
        }
    }
}
