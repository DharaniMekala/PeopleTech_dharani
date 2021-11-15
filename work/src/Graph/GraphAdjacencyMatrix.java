package Graph;

public class GraphAdjacencyMatrix {

	static int size = 5;
	static int[][] adj = new int[size][size];

	public static void addEdges(int u, int v) {
		// directed graph
		if (u < size && v < size) {
			adj[u][v] = 1;
		}

		// undirected graph
//		if (u < size && v < size) {
//			adj[u][v] = 1;
//			adj[v][u] = 1;
//		}
	}

	public static void print() {
		System.out.println("Adjacent Matrix : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				adj[i][j] = 0;
			}
		}
		addEdges(0, 1);
		addEdges(0, 4);
		addEdges(1, 2);
		addEdges(1, 3);
		addEdges(1, 4);
		addEdges(2, 3);
		addEdges(3, 4);

		print();
	}

}