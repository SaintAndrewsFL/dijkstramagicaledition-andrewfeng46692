public class Node {
    private final String name;
    private int weight;
    private boolean inAdjacency;

    public Node(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.inAdjacency = false; // Default state
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isInAdjacency() {
        return inAdjacency;
    }

    public void setInAdjacency(boolean inAdjacency) {
        this.inAdjacency = inAdjacency;
    }

    @Override
    public String toString() {
        return name + " (" + weight + ")";
    }
}
