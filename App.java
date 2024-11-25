import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("CD/caso40_2.txt");
        fileHandler.findLabirinthZones();
    }   
}