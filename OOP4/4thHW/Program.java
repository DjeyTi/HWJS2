import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Read read = new Read("HW2/OOP4/4thHW/file.JSON");
        System.out.println(read.getMessage());
    }
}
