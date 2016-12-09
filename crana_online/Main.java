package crana_online;

public class Main {
	public static void main(String[] args) {
		
		String topo_address="inputFile//graph_t4.txt";
		Graph g=new Graph(topo_address);
		System.out.println("Graph Init Completed");
		
		
		double distance=g.dijkstra(0,3);
		System.out.println("distance = "+distance);
	}
}