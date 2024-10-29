import java.util.ArrayList;
import java.util.HashMap;

public class Graph{

private HashMap<Node, ArrayList<Node>> adjList = new HashMap<>();

public Graph(){
    adjList = new HashMap<>();
 }

public void addVertex(Node v){
    adjList.put(v, new ArrayList<>());
}

public void addEdge(Node v, Node w){
    if(!adjList.containsKey(v)){
        addVertex(v);
    }
    if(!adjList.containsKey(w)){
        addVertex(w);
    }
    adjList.get(v).add(w);
}

public ArrayList<Node> getNeighbors(Node v){
    return adjList.get(v);
}

public void printGraph(){
    for(Node v : adjList.keySet()){
        System.out.print(v.getValue() + ": ");
        for(Node w : adjList.get(v)){
            System.out.print(w.getValue() + " ");
        }
        System.out.println();
    }

}

}