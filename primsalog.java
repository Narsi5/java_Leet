import java.util.*;

class iPair {
    int first, second;
    public iPair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Graph {
    int V;
    List<List<iPair> > adj;

    public Graph(int V)
    {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v, int w)
    {
        adj.get(u).add(new iPair(v, w));
        adj.get(v).add(new iPair(u, w));
    }

    void minimumspanningtree()
    {
        PriorityQueue<iPair> pq = new PriorityQueue<>(
                V, new Comparator<iPair>() {
            public int compare(iPair a, iPair b)
            {
                return a.second - b.second;
            }
        });

        int source = 0;

        int INF = Integer.MAX_VALUE;
        int[] key = new int[V];
        Arrays.fill(key, INF);

        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        boolean[] inMST = new boolean[V];

        pq.offer(new iPair(0, source));
        key[source] = 0;

        while (!pq.isEmpty()) {
            int u = pq.peek().second;
            pq.poll();

            if (inMST[u]) {
                continue;
            }

            inMST[u] = true; // Include vertex in MST

            for (iPair i : adj.get(u)) {
                int v = i.first;
                int weight = i.second;

                if (!inMST[v] && key[v] > weight) {

                    key[v] = weight;
                    pq.offer(new iPair(key[v], v));
                    parent[v] = u;
                }
            }
        }


        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }
}

// Driver class
public class Main {
    public static void main(String[] args)
    {

        int V = 9;

        Graph graph = new Graph(V);

        // graph
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 8, 2);
        graph.addEdge(2, 5, 4);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);

        graph.minimumspanningtree();
    }
}

