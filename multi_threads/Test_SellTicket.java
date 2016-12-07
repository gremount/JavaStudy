package multi_threads;

public class Test_SellTicket {

	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
	}
}
