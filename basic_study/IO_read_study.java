package basic_study;

import java.io.*;

public class IO_read_study {
	public static void main(String[] args)
	{
		try{
			BufferedReader br=new BufferedReader(new FileReader("inputFile//data.txt"));
			String line=br.readLine();
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
