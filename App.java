import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Graph graph = FileHandler.read("CD/caso40_2.txt");	

        Node start = graph.getInitialNode();

        graph.getNeighbors(start);

        FileHandler.searchZones(graph, start, 0);
    }   
}