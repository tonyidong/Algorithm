package minimumSpanningTreeWeighted;

public class DatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph theGraph = new Graph();
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C'); 
		theGraph.addVertex('D'); 
		theGraph.addVertex('E'); 
		theGraph.addVertex('F');
		
		theGraph.addEdge(0, 1, 6); 
		theGraph.addEdge(0, 3, 4);
		theGraph.addEdge(1, 2, 10);
		theGraph.addEdge(1, 3, 7);
		theGraph.addEdge(1, 4, 7);
		theGraph.addEdge(2, 3, 8);
		theGraph.addEdge(2, 4, 5);
		theGraph.addEdge(2, 5, 6);
		theGraph.addEdge(3, 4, 12);
		theGraph.addEdge(4, 5, 7);
		
		System.out.print("Minimum spanning tree: ");
		theGraph.mst();
	}

}
