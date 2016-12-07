package basic_study;

public class TryCatch_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1;
		try{
			if(a<=0){
				Exception e = new Exception("a must be positive");
            	throw e;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
