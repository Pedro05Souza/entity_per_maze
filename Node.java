import java.util.HashMap;

class Node {
    private String id;
    private Character value;
    private boolean visited;
    private String character;
    private HashMap<Character, String> characterHashMap = new HashMap<>();

    public Node(Character value, int x, int y) {
        this.value = value;
        this.visited = false;
        this.character = getCharacterHashMap();
        this.id = x + "," + y;
    }

    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
        this.character = characterHashMap.get(value); 
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getCharacter() {
        return character;
    }

    public String getCharacterHashMap(){
        characterHashMap.put('D', "Goblin");
        characterHashMap.put('E', "Elfo");
        characterHashMap.put('A', "Gnomo");
        characterHashMap.put('C', "Cavaleiro");
        characterHashMap.put('F', "Feijao");
        return characterHashMap.get(value);
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getId() {
        return id;

    }
    
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", visited=" + visited +
                ", characterType=" + character +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;
        return id.equals(node.id);
    }
}