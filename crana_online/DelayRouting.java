package crana_online;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DelayRouting {
	public  Set<Integer> S;
	public  Set<Integer> V;
	public  List<Integer> p;//who's your dady
	public  List<Double> d;//distance
	public  Double INF = 100000.0;
	
	public void Update(int src, Map<Integer,List<Edge>> adjL){
		for(int i=0;i<adjL.get(src).size();i++){
			Edge e=adjL.get(src).get(i);
			e.delay=1/e.bw;
			if(d.get(e.src)+e.delay<d.get(e.dst)){
				d.set(e.dst,d.get(e.src)+e.delay);
				p.set(e.dst,e.src);
			}
		}
	}
	
	public int FindMin(){
		double mine=INF;
		int mine_loc=-1;
		//System.out.println(incL.size());
		
		for(Integer i:S){
			//System.out.println(i);
			if(mine>=d.get(i)) {
				mine=d.get(i);
				mine_loc=i;
			}
		}
		return mine_loc;
	}
	
	//点到点dijkstra
	public double dijkstra(int src, int dst, Graph g){
		p = new ArrayList<>();
		d = new ArrayList<>();
		S = new HashSet<Integer>();
		V = new HashSet<Integer>();
		
		S.clear();V.clear();
		for(int i=0;i<g.numDpid;i++){
			S.add(i);
			d.add(INF);
			p.add(-2);
		}
		d.set(src,0.0);
		p.set(src,-1);
		
		Update(src,g.adjL);
		S.remove(src);
		V.add(src);
		
		while(S.size()!=0){
			int mine_loc;
			//System.out.println(S.size());
			mine_loc=FindMin();
			if(mine_loc==dst) {
				return d.get(mine_loc);
			}
			if(mine_loc==-1) return INF;
			Update(mine_loc,g.adjL);
			S.remove(mine_loc);
			V.add(mine_loc);
		}
		return INF;
	}
}
