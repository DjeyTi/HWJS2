package HW5.Calc;

import java.io.FileWriter;
import java.io.IOException;

class Logger {
    String path = "HW2/OOP5/HW5/Calc/file.txt";

    Logger() {
        this.path = "HW2/OOP5/HW5/Calc/file.txt";
    }

    void writeOperandum(String arg) throws IOException {
        try (FileWriter writer = new FileWriter(path))
        {
            writer.write("Operandum: ");
            writer.write(arg);
            writer.write("\n");
        }
    }
}
