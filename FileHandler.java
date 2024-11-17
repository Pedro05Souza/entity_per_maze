import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {

    public static void read(String file) {
        Graph graph = new Graph();

        try {
              List<String> lines = Files.readAllLines(Paths.get(file));

              for(int k = 1; k < lines.size(); k++){
                  for(int i = 0; i < lines.get(k).length(); i++){

                    if(lines.get(k).charAt(i) == ' '){
                        continue;
                    }

                    Node node = new Node(lines.get(k).charAt(i));

                    Character nodeValue = Character.toUpperCase(node.getValue());

                    graph.addVertex(node);

                    String hexa = Converter.convertHexa(nodeValue);

                    for(int j = 0; j < hexa.length(); j++){

                        if(hexa.charAt(j) != '0'){
                            continue;
                        }
                        
                        if(i == 0){
                            System.out.println("Adding edge to node up: " + node.getValue());
                            Node node2 = new Node(lines.get(k - 1).charAt(i));
                            graph.addEdge(node, node2);
                        } 
                        else if(i == 1){
                            System.out.println("Adding edge to node right: " + node.getValue());
                            Node node2 = new Node(lines.get(k).charAt(i + 1));
                            graph.addEdge(node, node2);
                        } 
                        else if(i == 2){
                            System.out.println("Adding edge to node down: " + node.getValue());
                            Node node2 = new Node(lines.get(k + 1).charAt(i));
                            graph.addEdge(node, node2);
                        } 
                        else {
                            System.out.println("Adding edge to node in left: " + node.getValue());
                            Node node2 = new Node(lines.get(k).charAt(i - 1));
                            graph.addEdge(node, node2);
                        }
                    }
                      
                  }
              }
        } catch (Exception e) {
            System.out.println("Error reading file" + e);
        }
    }

}
    

