import java.util.*;

public class Dijkstra {
    private final Graph graph;

    public Dijkstra(Graph graph) {
        this.graph = graph;
    }

    /**
     * Implements Dijkstra's algorithm to find the shortest path between two vertices.
     *
     * @param start  The starting vertex
     * @param target The destination vertex
     * @return A string representing the shortest path and its cost, or an error message if no path exists.
     */
    public String findShortestPath(String start, String target) {
        if (!graph.hasVertex(start) || !graph.hasVertex(target)) {
            return "Invalid vertex";
        }

        // Map to store the shortest distance to each vertex
        Map<String, Integer> distances = new HashMap<>();
        // Map to store the previous vertex for path reconstruction
        Map<String, String> previous = new HashMap<>();
        // Priority queue to determine the next vertex to process
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(Node::getWeight));

        // Initialize distances to all vertices as infinity, except for the start vertex
        for (String vertex : graph.getVertices()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        queue.add(new Node(start, 0));

        // Debug: Initial PriorityQueue state
        System.out.println("Initial PriorityQueue: " + queue);

        while (!queue.isEmpty()) {
            // Get the vertex with the smallest distance
            Node currentNode = queue.poll();
            String current = currentNode.getName();

            // Process each neighbor of the current vertex
            for (Node neighbor : graph.getNeighbors(current)) {
                int newDist = distances.get(current) + neighbor.getWeight();
                if (newDist < distances.get(neighbor.getName())) {
                    distances.put(neighbor.getName(), newDist);
                    previous.put(neighbor.getName(), current);
                    queue.add(new Node(neighbor.getName(), newDist));
                }
            }

            // Debug: Print PriorityQueue state after processing each vertex
            System.out.println("PriorityQueue after evaluating " + current + ": " + queue);
        }

        // If the target vertex was not reached
        if (!previous.containsKey(target)) {
            return "No path exists between " + start + " and " + target;
        }

        // Reconstruct the path by backtracking from the target
        List<String> path = new ArrayList<>();
        for (String at = target; at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        // Return the final path and total cost
        return "Path (" + distances.get(target) + "): " + String.join(" -> ", path);
    }
}
