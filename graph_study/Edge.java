package graph_study;

public class Edge {
	public int id;
	public int src;
	public int dst;
	public double delay;
	public int bw;
	
	Edge(int id, int src, int dst, double delay, int bw){
		this.id=id;
		this.src=src;
		this.dst=dst;
		this.delay=delay;
		this.bw=bw;
	}
}
