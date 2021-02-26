package optional;

import java.util.Random;

public class Graph {
    private static int n;
    private int[][] matrix;
    private int[] viz;

    /**
     * a function that randomly creates the adjacency matrix
     */
    public void generateRandomGraph() {
        this.matrix = new int[n][n];
        Random rd = new Random();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                matrix[i][j] = matrix[j][i] = (Math.abs((rd.nextInt()) % 2));
            }
    }

    /**
     * a function that displays the matrix when called
     */
    public void displayMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    /**
     * @param viz  : keeps trace of what node has already been visited
     * @param node : the current node
     */
    public void DFS(int[] viz, int node) {

        viz[node] = 1;
        for (int i = 0; i < n; i++) {
            if (matrix[node][i] == 1 && viz[i] == 0) {
                DFS(viz, i);
            }
        }
    }

    public int isConnected() {
        int[] vis = new int[n];
        DFS(vis, 0);
        for (int i = 0; i < n; i++)
            if (vis[i] == 0)
                return 0;
        return 1;
    }

    /**
     * @param args : argument representing matrix/graph dimensions
     */
    public static void main(String args[]) {
        if (args.length < 1) {
            System.err.println(-1);
            System.out.println("Argument needed");
            System.exit(0);
        } else {
            n = Integer.parseInt(args[0]);
        }
        Graph demo = new Graph();
        demo.generateRandomGraph();
        demo.displayMatrix();
        if (demo.isConnected() == 0)
            System.out.println("The graph is not connected");
        else
            System.out.println("The graph is connected");
    }
}
