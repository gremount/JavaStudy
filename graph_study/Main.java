package graph_study;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Edge> incL=new ArrayList<>();
		int numDpid=3;
		Edge e1=new Edge(0,0,1,0.3,100);
		Edge e2=new Edge(1,0,2,1,100);
		Edge e3=new Edge(2,1,2,0.4,100);
		incL.add(e1);
		incL.add(e2);
		incL.add(e3);
		Graph g=new Graph(incL,numDpid);
		System.out.println("Graph Init Completed");
		double distance=g.dijkstra(0,2);
		System.out.println("distance = "+distance);
	}

}
