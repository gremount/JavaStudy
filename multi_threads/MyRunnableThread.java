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
			System.out.println("�߳̿�ʼ��"+this.name+",i="+i);  
		}
	}
}
