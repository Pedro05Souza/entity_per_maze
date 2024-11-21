import java.util.HashMap;

class Node {
    private Character value;
    private boolean visited;
    private String character;

    public Node(Character value) {
        this.value = value;
        this.visited = false;
        this.character = characterHashMap();
    }

    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
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

    private String characterHashMap(){
        HashMap<Character, String> charToString = new HashMap<>();

        charToString.put('D', "Goblin");
        charToString.put('E', "Arqueiro");
        charToString.put('A', "Gnomo");
        charToString.put('C', "Cavaleiro");
        charToString.put('F', "Feijao");
        return charToString.get(this.value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", visited=" + visited +
                ", characterType=" + character +
                '}';
    }

}