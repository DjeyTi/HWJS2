package HW5.Job;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Info {
    static String path = "HW2/OOP5/HW5/Job/file.txt";
    static Path file = Path.of(path);

    public static void getAllInfo() throws IOException {
        List<String> list = Files.readAllLines(file);
        for (String str: list)
            System.out.println(str);
    }

    public static void getOneInfo(String ID) throws IOException {
        List<String> list = Files.readAllLines(file);
        for (String str: list)
            if (str.contains("ID: " + ID)) {
                System.out.println(str);
                break;
            }
            else
                System.out.println("Worker not found");
    }
}

class InfoManager {
    static String path = "HW2/OOP5/HW5/Job/file.txt";
    static Path file = Path.of(path);
    
    public static void removeAllWorkers() throws IOException {
        Path file = Path.of(path);
        Files.delete(file);
        Files.createFile(file);
    }

    public static void removeWorker(String ID) throws IOException {
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

    public static void addNewWorker(Worker arg) throws IOException {
        List<String> list = Files.readAllLines(file);
        try (FileWriter writer = new FileWriter(path))
        {
            for (String str: list)
                writer.write(str + "\n");
            writer.write("ID: " + arg.ID + ", Name: " + arg.name + ", DoB: " + arg.DoB + ", payment: " + arg.payment + "p.\n");
        }
    }
}