package multi_threads;

public class Test_Runnable {

	public static void main(String[] args) {
		MyRunnableThread mt1=new MyRunnableThread("�߳�a");
		MyRunnableThread mt2=new MyRunnableThread("�߳�b");
		new Thread(mt1).start();
		new Thread(mt2).start();

	}

}
