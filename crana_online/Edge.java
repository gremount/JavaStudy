package crana_online;

public class Edge {
	public int id;
	public int src;
	public int dst;
	public double weight;
	public double bw;
	public double delay;
	
	Edge(int id, int src, int dst, double weight, double bw, double delay){
		this.id=id;
		this.src=src;
		this.dst=dst;
		this.weight=weight;
		this.bw=bw;
		this.delay=delay;
	}
	
	public String printEdge(){
		String s=this.id+" "+this.src+" "+this.dst+" "+this.weight+" "+this.bw+" "+this.delay;
		return s;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Edge other = (Edge) obj;
        if (id != other.id)
            return false;
        if (src != other.src)
            return false;
        if (dst != other.dst)
            return false;
        if (delay != other.delay)
            return false;
        if (bw != other.bw)
        	return false;
        if (weight != other.weight)
        	return false;
        return true; /* do not include latency */
    }
}
