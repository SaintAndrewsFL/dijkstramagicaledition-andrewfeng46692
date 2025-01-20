public class HogwartsGraph extends Graph {
    public HogwartsGraph() {
        initializeLocations();
    }

    private void initializeLocations() {
        addVertex("Astronomy Tower");
        addVertex("Gryffindor Tower");
        addVertex("Library");
        addVertex("Great Hall");
        addVertex("Hospital Wing");
        addVertex("Transfiguration");
        addVertex("Dungeons");
        addVertex("Quidditch Pitch");
        addVertex("Hagrid's Hut");
        addVertex("Forbidden Forest");

        addEdge("Astronomy Tower", "Library", 7);
        addEdge("Astronomy Tower", "Gryffindor Tower", 6);
        addEdge("Gryffindor Tower", "Great Hall", 5);
        addEdge("Library", "Great Hall", 4);
        addEdge("Library", "Hospital Wing", 4);
        addEdge("Great Hall", "Hospital Wing", 10);
        addEdge("Great Hall", "Transfiguration", 3);
        addEdge("Hospital Wing", "Transfiguration", 6);
        addEdge("Library", "Dungeons", 4);
        addEdge("Dungeons", "Quidditch Pitch", 7);
        addEdge("Quidditch Pitch", "Hagrid's Hut", 5);
        addEdge("Hagrid's Hut", "Forbidden Forest", 3);
        addEdge("Quidditch Pitch", "Forbidden Forest", 12);
    }
}