package basic_study;
import java.io.*;

public class IO_write_study {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String content="Thank you for your fish";
			
			File file=new File("outputFile//outDate.txt");
			
			//create the file if doesn't exists
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fw=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		}
		catch(IOException e){
			System.out.println("IO Problem");
		}
	}
}
