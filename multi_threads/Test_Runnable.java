package multi_threads;

public class Test_Runnable {

	public static void main(String[] args) {
		MyRunnableThread mt1=new MyRunnableThread("线程a");
		MyRunnableThread mt2=new MyRunnableThread("线程b");
		new Thread(mt1).start();
		new Thread(mt2).start();

	}

}
