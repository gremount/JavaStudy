package multi_threads;

public class Test {

	public static void main(String[] args) {
		MyThread mt1=new MyThread("�߳�a");  
		MyThread mt2=new MyThread("�߳�b");  
		mt1.start();  
		mt2.start();  

	}

}
