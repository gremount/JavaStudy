package multi_threads;

public class MyRunnableThread implements  Runnable {

	private String name;
	public MyRunnableThread(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){  
			System.out.println("线程开始："+this.name+",i="+i);  
		}
	}
}
