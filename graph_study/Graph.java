package graph_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
	public  Set<Integer> S;
	public  Set<Integer> V;
	public  List<Integer> p;//who's your dady
	public  List<Double> d;//distance
	public  Double INF = 100000.0;
	public  List<Edge> incL;//all links list
	public  Map<Integer,List<Edge>> adjL,adjRL;
	public  int numDpid;//num of nodes
	public  int numEdge;//num of edges
	
	Graph(List<Edge> incL,int numDpid){
		this.incL=incL;
        adjL = new HashMap<>(numDpid);
		adjRL = new HashMap<>(numDpid);
		
		this.numDpid=numDpid;
		numEdge=incL.size();
        
		for(int i=0;i<numEdge;i++)
		{
			if(adjL.containsKey(incL.get(i).src))
			     adjL.get(incL.get(i).src).add(incL.get(i));
			else{
				 adjL.put(incL.get(i).src, new ArrayList<Edge>());
				 adjL.get(incL.get(i).src).add(incL.get(i));
			}
			 
			if(adjRL.containsKey(incL.get(i).dst))
			     adjRL.get(incL.get(i).dst).add(incL.get(i));
			else{
				 adjRL.put(incL.get(i).dst, new ArrayList<Edge>());
				 adjRL.get(incL.get(i).dst).add(incL.get(i));
			}
        }
	}
	
	public void Update(int src, Map<Integer,List<Edge>> adjL){
		for(int i=0;i<adjL.get(src).size();i++){
			Edge e=adjL.get(src).get(i);
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
	
	//node������Ǵ�0��ʼ������ŵ�
	public double dijkstra(int src, int dst){
		p = new ArrayList<>(numDpid);
		d = new ArrayList<>(numDpid);
		S = new HashSet<Integer>();
		V = new HashSet<Integer>();
		
		S.clear();V.clear();
		for(int i=0;i<numDpid;i++){
			S.add(i);
			d.add(INF);
			p.add(-2);
		}
		d.set(src,0.0);
		p.set(src,-1);
		
		Update(src,adjL);
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
			Update(mine_loc,adjL);
			S.remove(mine_loc);
			V.add(mine_loc);
		}
		return INF;
	}
}
