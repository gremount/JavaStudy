package multi_threads;

class MyThread extends Thread{  
	private String name;  
	
	public MyThread(String name) {  
		super();  
		this.name = name;  
	}  
	
	public void run(){  
		for(int i=0;i<10;i++){  
			System.out.println("�߳̿�ʼ��"+this.name+",i="+i);  
		}  
	}  
}  
