import java.util.LinkedList;
import java.util.List;

public class BfsGraph {

    public static void bfs(List<LinkedList<Integer>> graph, int start) {
        boolean visited[] = new boolean[graph.size()];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);

        while (queue.size() != 0) {
            start = queue.poll();
            System.out.print(start + " ");

            for (Integer i : graph.get(start)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        // Making the graph in the adjacency list form
        int vertices = 7;
        List<LinkedList<Integer>> graph = new LinkedList<LinkedList<Integer>>();
        for (int i = 0; i <= vertices; i++) {
            graph.add(new LinkedList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(1);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(3);
        graph.get(5).add(4);
        graph.get(5).add(6);
        graph.get(5).add(7);
        graph.get(6).add(5);
        graph.get(7).add(5);


        // Calling the bfs function
        System.out.println("Breadth First Traversal " +
                "(starting from vertex 1)");
        bfs(graph, 1);
        System.out.println();
    }
}
