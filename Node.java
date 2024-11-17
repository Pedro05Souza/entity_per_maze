class Node {
    private Character value;
    private boolean visited;
    private boolean isCharacter;

    public Node(Character value) {
        this.value = value;
        this.visited = false;

        if(Character.isUpperCase(value)){
            this.isCharacter = true;
        } 
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

    public boolean isCharacter() {
        return isCharacter;
    }

    public void setCharacter(boolean character) {
        isCharacter = character;
    }

    

}