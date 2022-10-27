package HW5.Job;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Info {
    String path = "HW2/OOP5/HW5/Job/file.txt";
    Path file = Path.of(path);

    public Info() {
    }

    public void addNewInfo(Worker arg) throws IOException {
        List<String> list = Files.readAllLines(file);
        try (FileWriter writer = new FileWriter(path))
        {
            for (String str: list)
                writer.write(str + "\n");
            writer.write("ID: ");
            writer.write(arg.ID);
            writer.write(", Name: ");
            writer.write(arg.name);
            writer.write(", DoB: ");
            writer.write(arg.DoB);
            writer.write(", payment: ");
            writer.write(arg.payment);
            writer.write("p.\n");
        }
    }

    public void getAllInfo() throws IOException {
        List<String> list = Files.readAllLines(file);
        for (String str: list)
            System.out.println(str);
    }

    public void getOneInfo(String ID) throws IOException {
        List<String> list = Files.readAllLines(file);
        for (String str: list)
            if (str.contains("ID: " + ID))
                System.out.println(str);
            else
                System.out.println("Worker not found");
    }

    public void removeWorker(String ID) throws IOException {
        List<String> list = Files.readAllLines(file);
        Path file = Path.of(path);
        Files.delete(file);
        Files.createFile(file);
        try (FileWriter writer = new FileWriter(path))
        {
            for (String str: list)
                if (str.contains("ID: " + ID))
                    continue;
                else
                    writer.write(str + "\n");
        }
    }

    public void removeAllWorkers() throws IOException {
        Path file = Path.of(path);
        Files.delete(file);
        Files.createFile(file);
    }
}
