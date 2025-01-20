import java.util.*;

public class Graph {
    private final Map<String, List<Node>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight) {
        adjacencyList.get(from).add(new Node(to, weight));
        adjacencyList.get(to).add(new Node(from, weight)); // For undirected graph
    }

    public List<Node> getNeighbors(String vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<String> getVertices() {
        return adjacencyList.keySet();
    }

    public boolean hasVertex(String vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public void printGraph() {
        for (String vertex : adjacencyList.keySet()) {
            System.out.println(vertex + " -> " + adjacencyList.get(vertex));
        }
    }
}