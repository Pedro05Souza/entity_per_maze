import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileHandler {

    private Graph graph;

    public FileHandler(String file) {
        graph = new Graph();
        read(graph, file);
    }

    public void read(Graph graph, String file) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            List<String> trimmedLines = new ArrayList<>();
            HashMap<String, Node> nodeMap = new HashMap<>();
    
            for (String line : lines) {
                String trimmed = line.replaceAll("\\s", "");
                if (!trimmed.isEmpty()) {
                    trimmedLines.add(trimmed);
                }
            }
    
            for (int k = 1; k < trimmedLines.size(); k++) {
                for (int i = 0; i < trimmedLines.get(k).length(); i++) {
                    Character currentChar = trimmedLines.get(k).charAt(i);
                    String nodeId = i + "," + k;
    
                    Node node = nodeMap.getOrDefault(nodeId, new Node(currentChar, i, k));
                    nodeMap.put(nodeId, node);
    
                    Character nodeValue = Character.toUpperCase(currentChar);
                    String binary = Converter.convertHexa(nodeValue);
    
                    if (binary.equals("1111")) {
                        graph.addVertex(node);
                    }
    
                    for (int j = 0; j < 4; j++) {
                        if (binary.charAt(j) == '1') {
                            continue;
                        }
    
                        Node neighbor = null;
                        if (j == 0 && k > 1) {
                            neighbor = nodeMap.getOrDefault((i) + "," + (k - 1), new Node(trimmedLines.get(k - 1).charAt(i), i, k - 1));
                        } else if (j == 1 && i < trimmedLines.get(k).length() - 1) {
                            neighbor = nodeMap.getOrDefault((i + 1) + "," + k, new Node(trimmedLines.get(k).charAt(i + 1), i + 1, k));
                        } else if (j == 2 && k < trimmedLines.size() - 1) {
                            neighbor = nodeMap.getOrDefault((i) + "," + (k + 1), new Node(trimmedLines.get(k + 1).charAt(i), i, k + 1));
                        } else if (j == 3 && i > 0) {
                            neighbor = nodeMap.getOrDefault((i - 1) + "," + k, new Node(trimmedLines.get(k).charAt(i - 1), i - 1, k));
                        }
    
                        if (neighbor != null) {
                            nodeMap.put(neighbor.getId(), neighbor);
                            graph.addEdge(node, neighbor);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file" + e);
        }
    
        graph.printGraph();
    }

    public void findLabirinthZones() {;
        int max = 0;
        String entityName = "";
        int isolatedZones = 0;
        

        for(Node node : graph.getAdjList().keySet()){
            if(!node.isVisited()) {
            isolatedZones++;
            HashMap<String, Integer> zoneEntities = new HashMap<>();
            dfs(node, zoneEntities);

            for (String key : zoneEntities.keySet()) {
                if (zoneEntities.get(key) > max) {
                    max = zoneEntities.get(key);
                    entityName = key;
                }

            }
        }
    }
    System.out.println("Entidade mais presente: " + entityName + " com " + max + " entidades" + ", Zonas isoladas: " + isolatedZones);

    }

    public void dfs(Node node, HashMap<String, Integer> maxEntities){
        node.setVisited(true);

        if (node.getCharacter() != null){
            if (node.getCharacter() != null) {
                System.out.println("Node: " + node.getCharacter());
            maxEntities.put(node.getCharacter(), maxEntities.getOrDefault(node.getCharacter(), 0) + 1);
            }
        }

        for (Node neighbor : graph.getNeighbors(node)) {
            if (!neighbor.isVisited()) {
                dfs(neighbor, maxEntities);
            }
        }
    }

 }
    

