import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileReader filePath = new FileReader("CD/caso40_2.txt");

        FileHandler.read(filePath);
    }
    
}
