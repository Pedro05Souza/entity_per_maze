import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandler {

    public static void read(FileReader file) {
        BufferedReader reader = new BufferedReader(file);
        Graph graph = new Graph();

        try {
            reader.readLine(); // pulando a primeira linha

            for(String line = reader.readLine(); line != null; line = reader.readLine()) {
                for(String character : line.split("")) {
                    if(character.equals(" ")) {
                        continue;
                    }
                    
                    Node node = new Node(character);
                    String binaryValue = Converter.convertHexa(character);
                    System.out.println("Character: " + character + " Binary: " + binaryValue);
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        
    }
    
}
