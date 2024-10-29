class Node {
    private String value;
    private boolean visited;

    public Node(String value) {
        this.value = value;
        this.visited = false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    

}