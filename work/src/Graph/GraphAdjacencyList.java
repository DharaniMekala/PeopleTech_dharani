package Graph;

import java.util.ArrayList;

public class GraphAdjacencyList {

	static int size = 5;

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
//		adj.get(v).add(u); // only for undirected graph
	}

	public static void print(ArrayList<ArrayList<Integer>> adj) {
		System.out.println("Graph Adjacency List represention: ");
		for (int i = 0; i < adj.size(); i++) {
			System.out.print(i + " ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print("->" + adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			adj.add(new ArrayList<>());
		}

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);

		print(adj);

	}

}