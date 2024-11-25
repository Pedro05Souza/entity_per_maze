import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("casos-5/casos-5/caso40_5a.txt");
        fileHandler.findLabirinthZones();
    }   
}