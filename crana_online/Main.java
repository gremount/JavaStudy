package crana_online;

public class Main {
	public static void main(String[] args) {
		
		String topo_address="inputFile//graph_t4.txt";
		Graph g=new Graph(topo_address);
		System.out.println("Graph Init Completed");
		
		//路由模块启动
		DelayRouting dr = new DelayRouting();
		//LoadBalanceRouting lbr = new LoadBalanceRouting();
		//EnergyEfficiencyRouting eer = new EnergyEfficiencyRouting();
		//TroughputRouting tr = new TroughputRouting();
		
		//提方案
		
		//评价方案
		
		//选择方案
		
		//部署
		
		double distance=dr.dijkstra(0,3,g);
		System.out.println("distance = "+distance);
	}
}