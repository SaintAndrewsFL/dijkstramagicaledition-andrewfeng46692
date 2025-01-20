public class Main {
    public static void main(String[] args) {
        HogwartsGraph hogwartsGraph = new HogwartsGraph();
        Dijkstra dijkstra = new Dijkstra(hogwartsGraph);

        System.out.println(hogwartsGraph.getVertices());
        hogwartsGraph.printGraph();

        System.out.println(dijkstra.findShortestPath("Astronomy Tower", "Forbidden Forest"));
        System.out.println(dijkstra.findShortestPath("Library", "Hagrid's Hut"));
    }
}