import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {

    public static void read(String file) {
        Graph graph = new Graph();

        try {
              List<String> lines = Files.readAllLines(Paths.get(file));

              for(int i = 0; i < lines.size(); i++){
                lines.set(i, lines.get(i).replaceAll("\\s", ""));
            }
              
              for(int k = 1; k < 2; k++){

                  for(int i = 0; i < lines.get(k).length(); i++){

                    Node node = new Node(lines.get(k).charAt(i));
                    
                    if(Character.isUpperCase(node.getValue())){
                        node.setCharacter(true);
                    }

                    Character nodeValue = Character.toUpperCase(node.getValue());

                    graph.addVertex(node);

                    String hexa = Converter.convertHexa(nodeValue);

                    for(int j = 0; j < 4; j++){

                        if(hexa.charAt(j) == '1'){
                            continue;
                        }
                        
                        if(j == 0 && k > 1){
                            Node node2 = new Node(lines.get(k - 1).charAt(i));
                            graph.addEdge(node, node2);
                        } 
                        else if(j == 1 && i < lines.get(k).length() - 1){
                            Node node2 = new Node(lines.get(k).charAt(i + 1));
                            graph.addEdge(node, node2);
                        } 
                        else if(j == 2 && k < lines.size() - 1){
                            Node node2 = new Node(lines.get(k + 1).charAt(i));
                            graph.addEdge(node, node2);
                        } 
                        else if(j == 3 && i > 0){
                            Node node2 = new Node(lines.get(k).charAt(i - 1));
                            graph.addEdge(node, node2);
                        }
                    }

                    System.out.println(graph.getNeighbors(node));
                      
                  }
              }
        } catch (Exception e) {
            System.out.println("Error reading file" + e);
        }
    }

}
    

