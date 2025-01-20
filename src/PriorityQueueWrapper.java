import java.util.*;

public class PriorityQueueWrapper {
    private final PriorityQueue<Node> queue;

    public PriorityQueueWrapper() {
        this.queue = new PriorityQueue<>(new NodeComparator());
    }

    public void add(Node node) {
        queue.add(node);
    }

    public Node poll() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node n1, Node n2) {
            return Integer.compare(n1.getWeight(), n2.getWeight());
        }
    }
}