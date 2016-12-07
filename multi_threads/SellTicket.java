package multi_threads;

public class SellTicket implements Runnable{
	private int tickets=10;
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			if(tickets>0)
				System.out.println("sell ticket "+this.tickets--);
		}
	}
}


