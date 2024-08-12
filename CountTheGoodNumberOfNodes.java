import java.util.*;

public class CountTheGoodNumberOfNodes {

    public static int count(int[][] edges) {
        int n = edges.length + 1;  // Number of nodes in the tree

        // Build the adjacency list representation of the tree
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Prepare arrays for subtree sizes and visited nodes
        int[] subtreeSize = new int[n];
        boolean[] visited = new boolean[n];

        // Perform DFS to compute subtree sizes
        dfs(0, adjList, subtreeSize, visited);

        // Reset visited array for the second DFS
        Arrays.fill(visited, false);

        // Count good nodes
        return count(0, adjList, subtreeSize, visited);
    }

    private static void dfs(int node, List<List<Integer>> adjList, int[] subtreeSize, boolean[] visited) {
        visited[node] = true;
        subtreeSize[node] = 1;  // Start with size 1 for the node itself

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, subtreeSize, visited);
                subtreeSize[node] += subtreeSize[neighbor];
            }
        }
    }

    private static int count(int node, List<List<Integer>> list, int[] subtree, boolean[] vis) {
        vis[node] = true;
        int goodCount = 0;

        Set<Integer> childSizes = new HashSet<>();
        for (int neighbor : list.get(node)) {
            if (!vis[neighbor]) {
                int childSize = subtree[neighbor];
                childSizes.add(childSize);
                goodCount += count(neighbor, list, subtree, vis);
            }
        }

        if (childSizes.size() == 1) {
            goodCount++;
        }

        return goodCount;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {1, 4},
                {2, 5},
                {2, 6}
        };

        int result = count(edges);
        System.out.println("Number of good nodes: " + result); // Should output 7
    }
}
